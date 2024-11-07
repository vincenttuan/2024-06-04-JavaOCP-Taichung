package model.dao;

import java.util.List;

import model.entity.OrderItem;

public interface OrderItemDao {
	
	List<OrderItem> findOrderItemsByOrderId(Integer orderId);
	List<OrderItem> findOrderItemsByUserId(Integer userId);
	
}
