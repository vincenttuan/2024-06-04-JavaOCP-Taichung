package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Method URI                  功能
 * --------------------------------------------------------------------
 * GET    /room                 查詢所有會議室(多筆)
 * GET    /room/{roomId}        查詢指定會議室(單筆)
 * POST   /room                 新增會議室
 * POST   /room/update/{roomId} 完整修改會議室(同時修改 roomName 與 roomSize)
 * GET    /room/delete/{roomId} 刪除會議室
 * --------------------------------------------------------------------
 * */

@Controller
@RequestMapping("/room")
public class RoomController {
	
	@GetMapping // 查詢所有會議室(多筆)
	public String getRooms() {
		return "room"; // 指向 jsp 檔名
	}
	
	@GetMapping("/{roomId}") // 查詢指定會議室(單筆)
	public String getRoom() {
		return "room";
	}
	
	@PostMapping
	public String addRoom() { // 新增會議室
		return "room";
	}
	
	@PostMapping("/update/{roomId}")
	public String updateRoom() { // 修改會議室
		return "room";
	}
	
	@GetMapping("/delete/{roomId}") // 刪除會議室
	public String deleteRoom() {
		return "room";
	}
	
}
