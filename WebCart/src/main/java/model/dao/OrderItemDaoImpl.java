package model.dao;

import java.util.ArrayList;
import java.util.List;

import model.entity.OrderItem;

public class OrderItemDaoImpl extends BaseDao implements OrderItemDao {

	@Override
	public List<OrderItem> findOrderItemsByOrderId(Integer orderId) {
		List<OrderItem> orderItems = new ArrayList<>();
		
		return orderItems;
	}

	@Override
	public List<OrderItem> findOrderItemsByUserId(Integer userId) {
		List<OrderItem> orderItems = new ArrayList<>();
		
		return orderItems;
	}

}
