package controller;

import java.io.IOException;

import com.mysql.cj.Session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 強迫將 session 失效
		HttpSession session = req.getSession();
		session.invalidate();
		
		// 登出成功要帶給 result.jsp 的參數
		req.setAttribute("result", "登出成功");
		req.setAttribute("redirectURL", "/WebCart/login");
		req.setAttribute("redirectName", "請重新登入");
		
		req.getRequestDispatcher("/WEB-INF/view/result.jsp").forward(req, resp); 
	}
	
}
