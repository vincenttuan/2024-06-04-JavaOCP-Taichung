package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// DTO: Data Transfer Object
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomDTO {
	private Integer id; // 對應 room.roomId 欄位
	private String name; // 對應 room.roomName 欄位
	private Integer size; // 對應 room.roomSize 欄位
}
