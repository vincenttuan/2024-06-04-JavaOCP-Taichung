package model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.entity.OrderItem;

public class OrderItemDaoImpl extends BaseDao implements OrderItemDao {

	@Override
	public List<OrderItem> findOrderItemsByOrderId(Integer orderId) {
		List<OrderItem> orderItems = new ArrayList<>();
		String sql = "select item_id, order_id, product_id, quantity, unit_price from order_items where order_id = ?";
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			pstmt.setInt(1, orderId);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return orderItems;
	}

	@Override
	public List<OrderItem> findOrderItemsByUserId(Integer userId) {
		List<OrderItem> orderItems = new ArrayList<>();
		String sql = "SELECT * FROM web.order_items " +
				     "where order_id in (SELECT order_id FROM orders where user_id = ?)";
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			pstmt.setInt(1, userId);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return orderItems;
	}

}
