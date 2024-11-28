package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.dto.RoomDTO;
import com.example.demo.service.RoomService;

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
	
	@Autowired
	private RoomService roomService;
	
	@GetMapping // 查詢所有會議室(多筆)
	public String getRooms(Model model) {
		List<RoomDTO> roomDTOs = roomService.getAllRooms(); 
		model.addAttribute("roomDTOs", roomDTOs); // 相當於 req.setAttribute("roomDTOs", roomDTOs);
		return "room/room"; // 指向 jsp 檔名
	}
	
	@GetMapping("/{roomId}") // 查詢指定會議室(單筆)
	public String getRoom() {
		return "";
	}
	
	@PostMapping
	public String addRoom(RoomDTO roomDTO) { // 新增會議室
		roomService.addRoom(roomDTO); // 儲存
		
		// 通知瀏覽器要去的地方(重導到...)
		return "redirect:http://localhost:8080/room";
		//return "redirect:/room";
	}
	
	@PostMapping("/update/{roomId}")
	public String updateRoom() { // 修改會議室
		return "";
	}
	
	@GetMapping("/delete/{roomId}") // 刪除會議室
	public String deleteRoom(@PathVariable Integer roomId) {
		roomService.deleteRoom(roomId);
		return "redirect:http://localhost:8080/room";
	}
	
}
