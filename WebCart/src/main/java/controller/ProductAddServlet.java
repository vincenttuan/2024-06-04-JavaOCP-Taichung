package controller;

import java.io.IOException;
import java.util.Base64;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/product/add")
@MultipartConfig(maxFileSize = 1024*1024*10) // 設定上傳大小 10M
public class ProductAddServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 重導一個商品新增 jsp 網頁
		req.getRequestDispatcher("/WEB-INF/view/product_add.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 商品新增程序
		// 接收一般表單資料
		String productName = req.getParameter("productName");
		String price = req.getParameter("price");
		String qty = req.getParameter("qty");
		
		// 接收上傳資料(type="file")
		Part productImage = req.getPart("productImage");
		// 將 productImage 轉 base64 字串
		String imageBase64 = null;
		if(productImage != null && productImage.getSize() > 0) {
			imageBase64 = Base64.getEncoder().encodeToString(productImage.getInputStream().readAllBytes());
		}
		
		resp.getWriter().print("<img src='data:image/png;base64," + imageBase64 + "'>");
		//resp.getWriter().print(imageBase64);
	}
	
}
