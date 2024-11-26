package com.example.demo.test.room;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.dto.RoomDTO;
import com.example.demo.model.entity.Room;
import com.example.demo.repository.RoomRepositoryJDBC;
import com.example.demo.service.RoomService;

@SpringBootTest
public class SaveRoomTest2 {
	// 測試: RoomService
	
	@Autowired
	RoomService roomService;
	
	@Test
	public void test1() {
		// 新增
		RoomDTO roomDTO = new RoomDTO(707, "707(S)", 5);
		roomService.addRoom(roomDTO);
		System.out.println("新增完成, 請查資料庫");
		
		roomService.addRoom(806, "806(S)", 6);
		System.out.println("新增完成, 請查資料庫");
		
	}
	
}
