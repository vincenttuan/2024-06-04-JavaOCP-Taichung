package com.example.demo.test.room;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.entity.Room;
import com.example.demo.repository.RoomRepositoryJDBC;

@SpringBootTest
public class FindRoomsTest {
	// 測試: RoomRepositoryJDBC
	
	@Autowired
	RoomRepositoryJDBC roomRepositoryJDBC;
	
	@Test
	public void test1() {
		List<Room> rooms = roomRepositoryJDBC.findAllRooms();
		System.out.println(rooms);
	}
	
}
