package model.dao;

import java.util.List;

import model.entity.Order;
import model.entity.OrderItem;

/**
 * 2024-11-01 v1.0 
 * 2024-11-07 v1.1
 * 
 * author: xxxx
 */
public interface OrderDao {
	// 取得該用戶所有訂單主檔
	public List<Order> findAllOrdersByUserId(Integer userId);
	
	// 取得該訂單的所有明細
	public List<OrderItem> findAllOrderItemsByOrderId(Integer orderId);
	
	// 取得該用戶所有訂單明細 <== v1.1
	public List<OrderItem> findAllOrderItemsByUserId(Integer userId);
		
	// 新增訂單(主檔)會得到訂單ID(order_id)
	public Integer addOrder(Order order);
	
	// 新增訂單明細
	public void addOrderItem(OrderItem orderItem);
	
	// 變更訂單狀態(Finished(結帳), Pending, Cancel(取消))
	public void changeOrderStatus(Integer orderId, String orderStatus);
}
