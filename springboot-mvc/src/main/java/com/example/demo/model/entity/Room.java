package com.example.demo.model.entity;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity
// 對應 room 資料表
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {
	
	@NotNull(message = "id 不可以是空值")
	private Integer roomId; // 對應 room_id 欄位
	
	@Size(min = 1, max = 10, message = "名稱必須限定在 {min} ~ {max} 個字間")
	private String roomName; // 對應 room_name 欄位
	
	@Range(min = 1, max = 200, message = "人數範圍限制在 {min} ~ {max} 人")
	private Integer roomSize; // 對應 room_size 欄位
	
}
