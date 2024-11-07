package model.dao;

import java.util.ArrayList;
import java.util.List;

import model.entity.OrderItem;

public class OrderItemDaoImpl extends BaseDao implements OrderItemDao {

	@Override
	public List<OrderItem> findOrderItemsByOrderId(Integer orderId) {
		List<OrderItem> orderItems = new ArrayList<>();
		String sql = "select item_id, order_id, product_id, quantity, unit_price from order_items where order_id = ?";
		return orderItems;
	}

	@Override
	public List<OrderItem> findOrderItemsByUserId(Integer userId) {
		List<OrderItem> orderItems = new ArrayList<>();
		
		return orderItems;
	}

}
