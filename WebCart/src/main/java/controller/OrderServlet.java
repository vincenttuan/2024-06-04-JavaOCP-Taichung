package controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.dto.ProductDto;
import model.dto.UserDto;
import model.service.OrderService;
import model.service.ProductService;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	
	private ProductService productService = new ProductService();
	private OrderService orderService = new OrderService();
	
	// 訂購頁面
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<ProductDto> productDtos = productService.queryAll();
		req.setAttribute("productDtos", productDtos);
		req.getRequestDispatcher("/WEB-INF/view/order.jsp").forward(req, resp);
	}
	
	// 訂購程序->到購物車 (存入到資料表中)
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] productIds = req.getParameterValues("productId");
		String[] prices = req.getParameterValues("price");
		String[] amounts = req.getParameterValues("amount");
		
		resp.getWriter().println(Arrays.toString(productIds));
		resp.getWriter().println(Arrays.toString(prices));
		resp.getWriter().println(Arrays.toString(amounts));
		
		// 因為要取得 userId, 所以可以從 session 變數中得到 UserDto 物件
		HttpSession session = req.getSession();
		UserDto userDto = (UserDto)session.getAttribute("userDto");
		Integer userId = userDto.getUserId(); // 取的 user id
		
		// 將使用者的訂單資訊傳給 orderService
		orderService.addOrder(userId, productIds, prices, amounts);
		resp.getWriter().println("Order OK!");
	}
	
}
