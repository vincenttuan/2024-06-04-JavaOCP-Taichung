package model.dao;

import java.util.List;

import model.entity.Order;
import model.entity.OrderItem;

public class OrderDaoImpl extends BaseDao implements OrderDao {

	@Override
	public List<Order> findAllOrdersByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderItem> findAllOrderItemsByOrderId(Integer orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer addOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addItem(OrderItem orderItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeOrderStatus(String orderStatus) {
		// TODO Auto-generated method stub
		
	}
	
}
