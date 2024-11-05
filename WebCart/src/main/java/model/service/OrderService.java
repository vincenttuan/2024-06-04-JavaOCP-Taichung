package model.service;

import model.dao.OrderDao;
import model.dao.OrderDaoImpl;
import model.dto.OrderItemDto;
import model.entity.Order;
import model.entity.OrderItem;

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
		
		// 新增訂單主檔並得到 orderId
		Integer orderId = orderDao.addOrder(order);
		System.out.println("orderId: " + orderId);
		
		// 新增訂單明細檔
		for(int i=0;i<ids.length;i++) {
			Integer productId = Integer.parseInt(ids[i]);
			Double price = Double.parseDouble(prices[i]);
			Integer amount = Integer.parseInt(amounts[i]);
			if(amount == 0) {
				continue;
			}
			// 建立訂單明細物件
			OrderItem orderItem = new OrderItem();
			orderItem.setOrderId(orderId);
			orderItem.setProductId(productId);
			orderItem.setQuantity(amount);
			orderItem.setUnitPrice(price);
			// 新增訂單明細檔
			orderDao.addOrderItem(orderItem);
		}
		
	}
	
}
