package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Random;

import javax.imageio.ImageIO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/CAPTCHA")
public class CAPTCHAServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. 產生四位數的隨機驗證碼(不足補0)
		SecureRandom secureRandom = new SecureRandom();
		String authCode = String.format("%04d", secureRandom.nextInt(10000)); // 0000~9999
		//resp.getWriter().print(authCode);
		// 2. 將認證碼存入到 session
		HttpSession session = req.getSession();
		session.setAttribute("authCode", authCode);
		// 3. 將資料以圖片形式送出
		ImageIO.write(getAuthCodeImage(authCode), "JPEG", resp.getOutputStream());
	}
	
	// 產生圖像的方法
	private BufferedImage getAuthCodeImage(String authCode) {
		// 建立圖像區域
		BufferedImage img = new BufferedImage(80, 30, BufferedImage.TYPE_INT_RGB);
		// 建立畫布
		Graphics g = img.getGraphics();
		// 設定顏色
		g.setColor(Color.YELLOW); // 拿黃色的彩色筆
		// 塗滿背景
		g.fillRect(0, 0, 80, 30);
		// 設定顏色
		g.setColor(Color.BLACK);
		// 設定字型
		g.setFont(new Font("新細明體", Font.BOLD, 20)); // 字體, 風格, 大小
		// 繪文字
		g.drawString(authCode, 22, 22);
		// 加上干擾線
		g.setColor(Color.RED);
		Random random = new Random();
		for(int i=0;i<25;i++) {
			int x1 = random.nextInt(80);
			int y1 = random.nextInt(30);
			int x2 = random.nextInt(80);
			int y2 = random.nextInt(30);
			g.drawLine(x1, y1, x2, y2); // 繪直線
		}
		return img;
		
	}
}
