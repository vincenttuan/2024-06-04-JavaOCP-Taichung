package model.service;

import java.util.List;

import model.dao.Statistics;
import model.dao.StatisticsImpl;
import model.dto.ProductSalesSummary;

public class StatisticsService {
	private Statistics statistics = new StatisticsImpl();
	
	private List<ProductSalesSummary> getProductSalesSummaries() {
		return statistics.getProductSalesSummaries();
	}
}
