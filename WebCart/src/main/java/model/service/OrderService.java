package model.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.dao.OrderDao;
import model.dao.OrderDaoImpl;
import model.dto.OrderItemDto;
import model.entity.Order;
import model.entity.OrderItem;

public class OrderService {
	
	private OrderDao orderDao = new OrderDaoImpl();
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	// 修改訂單狀態-Finished
	public void orderFinished(Integer orderId) {
		orderDao.changeOrderStatus(orderId, "Finished");
	}
	
	// 修改訂單狀態-Cancel
	public void orderCancel(Integer orderId) {
		orderDao.changeOrderStatus(orderId, "Cancel");
	}
	
	// 新增訂單到購物車
	public void addOrder(Integer userId, String[] productIds, String[] prices, String[] amounts) {
		// 建立訂單主檔物件
		Order order = new Order();
		order.setOrderDate(sdf.format(new Date()));
		order.setOrderStatus("Pending");
		order.setTotalPrice(0.0);
		order.setUserId(userId);
		System.out.println(order);
		
		// 新增訂單主檔並得到 orderId
		Integer orderId = orderDao.addOrder(order);
		System.out.println("orderId: " + orderId);
		
		// 新增訂單明細檔
		for(int i=0;i<productIds.length;i++) {
			Integer productId = Integer.parseInt(productIds[i]);
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
