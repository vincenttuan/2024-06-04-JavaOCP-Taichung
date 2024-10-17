package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dto.UserDto;
import model.service.UserService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private UserService userService = new UserService();
	
	// 呈現登入頁面給使用者
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req, resp);
	}

	// 驗證使用者登入
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 接收登入表單的資訊
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		// 登入比對
		UserDto userDto = userService.loginCheck(username, password);
		String result = userDto == null ? "login error" : "login success";
		
		req.setAttribute("result", result);
		// 若登入成功到商品頁面反之到登入頁面
		req.setAttribute("redirectURL", userDto == null ? "/WebCart/login" : "/WebCart/product");
		req.setAttribute("redirectName", userDto == null ? "請重新登入" : "商品主頁");
		
		req.getRequestDispatcher("/WEB-INF/view/result.jsp").forward(req, resp);
	}
	
}
