package model.service;

import java.util.ArrayList;
import java.util.List;

import model.dao.OrderDao;
import model.dao.OrderDaoImpl;
import model.dto.OrderDto;
import model.entity.Order;

public class CartService {
	
	private OrderDao orderDao = new OrderDaoImpl();
	
	public List<OrderDto> findAllOrdersByUserId(Integer userId, String username) {
		List<OrderDto> orderDtos = new ArrayList<>();
		
		// 從資料表抓出該使用者的原始訂單資料
		List<Order> orders = orderDao.findAllOrdersByUserId(userId);
		System.out.println("orders 筆數: " + orders.size());
		
		for(Order order : orders) {
			// cart 的 orderStatus 必須是 Pending, 若不是 Pending 則不做事
			if(!order.getOrderStatus().equals("Pending")) {
				continue;
			}
			// 建立一個 OrderDto 物件將 order 的資料注入進去
			OrderDto orderDto = new OrderDto();
			orderDto.setOrderId(order.getOrderId());
			orderDto.setUserId(order.getUserId());
			orderDto.setUsername(username);
			orderDto.setOrderDate(order.getOrderDate());
			orderDto.setTotalPrice(order.getTotalPrice());
			orderDto.setOrderStatus(order.getOrderStatus());
			// 注入到 orderDtos
			orderDtos.add(orderDto);
		}
		System.out.println("orderDtos 筆數: " + orderDtos.size());
		return orderDtos;
	}
}
