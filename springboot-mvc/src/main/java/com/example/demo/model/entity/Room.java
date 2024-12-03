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
	
	private Integer roomId; // 對應 room_id 欄位
	
	private String roomName; // 對應 room_name 欄位
	
	private Integer roomSize; // 對應 room_size 欄位
	
}
