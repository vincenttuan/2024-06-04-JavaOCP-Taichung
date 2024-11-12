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
		
		// 編碼 UTF-8 (不透過 JSP 解決中文呈現問題)
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/plain;charset=utf-8");
		
		// 查詢該使用者的購物資料
		//resp.getWriter().println("購物車資料");
		List<OrderDto> orderDtos = cartService.findAllOrdersByUserId(userId, username);
		
		//resp.getWriter().print(orderDtos);
		req.setAttribute("orderDtos", orderDtos);
		req.getRequestDispatcher("/WEB-INF/view/cart.jsp").forward(req, resp);
	}
	
}
