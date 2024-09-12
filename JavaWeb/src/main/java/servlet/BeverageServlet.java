package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet/beverage")
public class BeverageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// forward 到指定 jsp
		req.getRequestDispatcher("/WEB-INF/view/beverage_form.jsp").forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 編碼 !! 重要~~
		req.setCharacterEncoding("utf-8");
		// 接收表單傳來的資料
		String userName = req.getParameter("userName");
		String email = req.getParameter("email");
		String orderDate = req.getParameter("orderDate");
		String amount = req.getParameter("amount");
		String beverageName = req.getParameter("beverageName");
		String ice = req.getParameter("ice");
		String sugar = req.getParameter("sugar");
		String[] additionalArray = req.getParameterValues("additional");
		String memo = req.getParameter("memo");
		
		
	}
	
	
	
}
