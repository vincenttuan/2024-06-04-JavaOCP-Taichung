package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.service.OrderService;

// 訂單結帳
@WebServlet("/order/submit")
public class OrderSubmitServlet extends HttpServlet {
	
	private OrderService orderService = new OrderService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer orderId = Integer.parseInt(req.getParameter("orderId"));
		orderService.orderFinished(orderId);
		
		// 重導到購物車
		resp.sendRedirect("/WebCart/cart");
	}
	
}
