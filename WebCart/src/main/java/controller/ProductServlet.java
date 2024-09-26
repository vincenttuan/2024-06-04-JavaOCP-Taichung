package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dto.ProductDto;
import model.service.ProductService;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {
	
	private ProductService productService = new ProductService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 取得所有商品資訊
		List<ProductDto> productDtos = productService.queryAll();
		// 將此商品資訊放到 request 屬性中
		req.setAttribute("productDtos", productDtos);
		// 重導到指定 jsp
		req.getRequestDispatcher("/WEB-INF/view/product.jsp").forward(req, resp);
		
	}
	
	
}
