package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dto.ProductSalesSummary;
import model.service.StatisticsService;

@WebServlet("/order/ranking")
public class OrderRankingServlet extends HttpServlet {
	
	private StatisticsService statisticsService = new StatisticsService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<ProductSalesSummary> productSalesSummaries = statisticsService.getProductSalesSummaries();
		
		req.setAttribute("productSalesSummaries", productSalesSummaries);
		
		req.getRequestDispatcher("/WEB-INF/view/order_ranking.jsp").forward(req, resp);
		
	}
	
	
	
}
