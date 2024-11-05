package model.service;

import model.dao.OrderDao;
import model.dao.OrderDaoImpl;
import model.entity.Order;

public class OrderService {
	
	private OrderDao orderDao = new OrderDaoImpl();
	
	// 新增訂單到購物車
	public void addOrder(Integer userId, String[] ids, String[] prices, String[] amounts) {
		// 建立訂單主檔物件
		Order order = new Order();
		order.setOrderDate("2024-11-05");
		order.setOrderStatus("Pending");
		order.setTotalPrice(0.0);
		order.setUserId(userId);
		System.out.println(order);
		//Integer orderId = orderDao.addOrder(order);
		
	}
	
}
