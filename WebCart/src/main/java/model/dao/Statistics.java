package model.dao;

import java.util.List;

import model.dto.ProductSalesSummary;

// 統計
public interface Statistics {
	// 取得銷售統計資料
	List<ProductSalesSummary> getProductSalesSummaries();
}
