package controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dto.ProductDto;
import model.service.ProductService;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	
	private ProductService productService = new ProductService();
	
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
		String[] ids = req.getParameterValues("id");
		String[] prices = req.getParameterValues("price");
		String[] amounts = req.getParameterValues("amount");
		
		resp.getWriter().println(Arrays.toString(ids));
		resp.getWriter().println(Arrays.toString(prices));
		resp.getWriter().println(Arrays.toString(amounts));
		
		// 將使用者的訂單資訊傳給 orderService
		// orderService.addOrder(ids, prices, amounts);
		
	}
	
}
