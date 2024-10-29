package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.entity.Order;
import model.entity.OrderItem;

public class OrderDaoImpl extends BaseDao implements OrderDao {

	@Override
	public List<Order> findAllOrdersByUserId(Integer userId) {
		String sql = "select order_id, user_id, order_date, total_price, order_status from orders where user_id = ?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			pstmt.setInt(1, userId);
			
			try(ResultSet rs = pstmt.executeQuery()) {
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
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
