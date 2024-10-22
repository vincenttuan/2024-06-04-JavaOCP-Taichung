package controller;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CAPTCHA")
public class CAPTCHAServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. 產生四位數的隨機驗證碼(不足補0)
		SecureRandom secureRandom = new SecureRandom();
		String authCode = String.format("%04d", secureRandom.nextInt(10000)); // 0000~9999
		resp.getWriter().print(authCode);
	}
	
}
