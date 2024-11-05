package model.dto;

import java.util.ArrayList;
import java.util.List;

public class OrderDto {
	// 主檔資料
	private Integer orderId;
	private Integer userId;
	private String username; // 利用 userId 可查到
	private String orderDate;
	private Double totalPrice;
	private String orderStatus;
	
	// 明細資料
	private List<OrderItemDto> orderItemDtos = new ArrayList<>();
	
	// 加入明細
	public void addOrderItemDto(OrderItemDto orderItemDto) {
		orderItemDtos.add(orderItemDto);
	}
	
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "OrderDto [orderId=" + orderId + ", userId=" + userId + ", username=" + username + ", orderDate="
				+ orderDate + ", totalPrice=" + totalPrice + ", orderStatus=" + orderStatus + ", orderItemDtos="
				+ orderItemDtos + "]";
	}

	
}
