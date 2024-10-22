package controller;

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
		
	}
}
