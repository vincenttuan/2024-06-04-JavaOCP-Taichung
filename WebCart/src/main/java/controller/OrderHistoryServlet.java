package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.dto.OrderDto;
import model.dto.UserDto;
import model.service.OrderService;

@WebServlet("/order/history")
public class OrderHistoryServlet extends HttpServlet {
	
	private OrderService orderService = new OrderService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		UserDto userDto = (UserDto)session.getAttribute("userDto");
		
		List<OrderDto> orderDtos = orderService.findAllOrderHistoryByUserId(userDto.getUserId());
		req.setAttribute("orderDtos", orderDtos);
		
		req.getRequestDispatcher("/WEB-INF/view/order_history.jsp").forward(req, resp);
		
	}
	
}
