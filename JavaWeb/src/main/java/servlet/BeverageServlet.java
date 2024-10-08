package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.entity.Beverage;

@WebServlet("/servlet/beverage")
public class BeverageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// forward 到指定 jsp
		req.getRequestDispatcher("/WEB-INF/view/beverage_form.jsp").forward(req, resp);
		/*
		resp.getWriter().print("<!DOCTYPE html>");
		resp.getWriter().print("<html>");
		resp.getWriter().print("<head>");
		resp.getWriter().print("<meta charset=\"UTF-8\">");
		resp.getWriter().print("<title>飲料訂購單</title>");
		resp.getWriter().print("</head>");
		resp.getWriter().print("<body>");
		resp.getWriter().print("<form method=\"post\" action=\"/JavaWeb/servlet/beverage\">");
		resp.getWriter().print("<fieldset>");
		resp.getWriter().print("<legend>飲料訂購單</legend>");
		resp.getWriter().print("姓名: <input type=\"text\" name=\"userName\" required /><p />");
		resp.getWriter().print("電郵: <input type=\"email\" name=\"email\" required /><p />");
		resp.getWriter().print("</fieldset>");
		resp.getWriter().print("</form>");
		resp.getWriter().print("</body>");
		resp.getWriter().print("</html>");
		*/
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 編碼 !! 重要~~
		req.setCharacterEncoding("utf-8");
		// 接收表單傳來的資料
		String userName = req.getParameter("userName");
		String email = req.getParameter("email");
		String orderDate = req.getParameter("orderDate");
		String amount = req.getParameter("amount"); // 數量
		String beverageName = req.getParameter("beverageName");
		String ice = req.getParameter("ice");
		String sugar = req.getParameter("sugar");
		String[] additionalArray = req.getParameterValues("additional");
		String memo = req.getParameter("memo");
		
		// 計算飲料價格(預設飲料一杯 30 元)
		int totalPrice = 30 * Integer.parseInt(amount);
		
		// 建立 entity 用來存放要傳遞給 jsp 的資料
		Beverage beverage = new Beverage(userName, email, orderDate, amount, beverageName, 
										 ice, sugar, additionalArray, memo, totalPrice);
		
		// 將 beverage 放到 request 屬性中, 目的是要傳遞給 jsp 使用
		req.setAttribute("beverage", beverage);
		
		// forward 到指定 jsp
		req.getRequestDispatcher("/WEB-INF/view/beverage_checkout.jsp").forward(req, resp); 
		
	}
	
}
