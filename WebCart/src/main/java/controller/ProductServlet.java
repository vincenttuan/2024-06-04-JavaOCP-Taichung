package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.dto.ProductDto;
import model.service.ProductService;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {
	
	private ProductService productService = new ProductService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 檢查是否有登入資訊 ?
		HttpSession session = req.getSession();
		if(session.getAttribute("userDto") == null) {
			// 使用者尚未登入, 要帶給 result.jsp 的參數
			req.setAttribute("result", "使用者尚未登入");
			req.setAttribute("redirectURL", "/WebCart/login");
			req.setAttribute("redirectName", "請登入");
			req.getRequestDispatcher("/WEB-INF/view/result.jsp").forward(req, resp); 
			return;
		}
		
		// 取得所有商品資訊
		List<ProductDto> productDtos = productService.queryAll();
		// 將此商品資訊放到 request 屬性中
		req.setAttribute("productDtos", productDtos);
		// 重導到指定 jsp
		req.getRequestDispatcher("/WEB-INF/view/product.jsp").forward(req, resp);
		
	}
	
	
}
