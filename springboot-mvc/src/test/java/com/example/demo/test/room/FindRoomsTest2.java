package com.example.demo.test.room;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.dto.RoomDTO;
import com.example.demo.service.RoomService;

@SpringBootTest
public class FindRoomsTest2 {
	// 測試: RoomService
	
	@Autowired
	RoomService roomService;
	
	@Test
	public void test1() {
		List<RoomDTO> rooms = roomService.getAllRooms();
		rooms.forEach(System.out::println);
	}
	
}
