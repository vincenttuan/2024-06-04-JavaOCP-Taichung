package model.dao;

import java.util.List;

import model.entity.Order;
import model.entity.OrderItem;

public interface OrderDao {
	// 取得該用戶所有訂單主檔
	public List<Order> findAllOrdersByUserId(Integer userId);
	
	// 取得單訂單的所有明細
	public List<OrderItem> findAllOrderItemsByOrderId(Integer orderId);
	
	// 新增訂單(主檔)會得到訂單ID(order_id)
	public Integer addOrder(Order order);
	
	// 新增訂單明細
	public void addItem(OrderItem orderItem);
	
}