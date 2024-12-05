package com.example.demo.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Rest 統一對外的資料格式
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {
	private int status; // 狀態
	private String message; // 訊息
	private T data; // 回應資料
	
	// 成功回應
	public static <T> ApiResponse<T> success(String message, T data) {
		return new ApiResponse<T>(200, message, data);
	}
	
	// 失敗回應
	public static <T> ApiResponse<T> error(int status, String message) {
		return new ApiResponse<T>(status, message, null);
	}
	
}
