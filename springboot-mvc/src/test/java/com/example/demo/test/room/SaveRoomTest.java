package com.example.demo.test.room;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.entity.Room;
import com.example.demo.repository.RoomRepositoryJDBC;

@SpringBootTest
public class SaveRoomTest {
	// 測試: RoomRepositoryJDBC
	
	@Autowired
	RoomRepositoryJDBC roomRepositoryJDBC;
	
	@Test
	public void test1() {
		// 新增
		Room room = new Room(404, "404(S)", 2);
		roomRepositoryJDBC.saveRoom(room);
		System.out.println("新增完成, 請查資料庫");
		
	}
	
}
