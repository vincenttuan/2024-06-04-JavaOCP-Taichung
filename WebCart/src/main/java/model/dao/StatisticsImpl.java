package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.dto.ProductSalesSummary;

public class StatisticsImpl extends BaseDao implements Statistics {

	@Override
	public List<ProductSalesSummary> getProductSalesSummaries() {
		String sql = "SELECT \r\n"
				+ "    p.product_id,\r\n"
				+ "    p.product_name,\r\n"
				+ "    SUM(oi.quantity * oi.unit_price) AS total\r\n"
				+ "FROM \r\n"
				+ "    web.order_items oi\r\n"
				+ "JOIN \r\n"
				+ "    web.product p ON oi.product_id = p.product_id\r\n"
				+ "JOIN \r\n"
				+ "    web.orders o ON oi.order_id = o.order_id\r\n"
				+ "WHERE \r\n"
				+ "    o.order_status = 'Finished'\r\n"
				+ "GROUP BY \r\n"
				+ "    p.product_id, p.product_name\r\n"
				+ "ORDER BY \r\n"
				+ "    total DESC;";
		
		List<ProductSalesSummary> productSalesSummaries = new ArrayList<>();
		try(Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				ProductSalesSummary productSalesSummary = new ProductSalesSummary();
				productSalesSummary.setProductId(rs.getInt("product_id"));
				productSalesSummary.setProductName(rs.getString("product_name"));
				productSalesSummary.setTotal(rs.getDouble("total"));
				
				productSalesSummaries.add(productSalesSummary);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return productSalesSummaries;
	}
	
}
