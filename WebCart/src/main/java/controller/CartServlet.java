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
import model.service.CartService;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {
	
	private CartService cartService = new CartService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 得到登入者的 userId
		HttpSession session = req.getSession();
		UserDto userDto = (UserDto)session.getAttribute("userDto");
		Integer userId = userDto.getUserId();
		String username = userDto.getUsername();
		
		// 查詢該使用者的購物資料
		List<OrderDto> orderDtos = cartService.findAllOrdersByUserId(userId, username);
		
		resp.getWriter().print(orderDtos);
	}
	
}
