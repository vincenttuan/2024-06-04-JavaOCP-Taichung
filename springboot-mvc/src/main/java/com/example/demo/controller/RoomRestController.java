package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.RoomException;
import com.example.demo.model.dto.RoomDTO;
import com.example.demo.model.response.ApiResponse;
import com.example.demo.service.RoomService;

/**
請求方法 URL 路徑              功能說明      請求參數                                  回應
-----------------------------------------------------------------------------------------------------
GET    /rest/rooms         取得所有房間列表 無                                       成功時返回所有房間的列表及成功訊息。
GET    /rest/room/{roomId} 取得指定房間資料 roomId (路徑參數，房間 ID)                  成功時返回指定房間資料及成功訊息。
POST   /rest/room          新增房間       請求體包含 roomDto                         成功時返回成功訊息，無回傳資料。
PUT    /rest/room/{roomId} 更新指定房間資料 roomId (路徑參數，房間 ID)，請求體包含 roomDto 成功時返回成功訊息，無回傳資料。
DELETE /rest/room/{roomId} 刪除指定房間    roomId (路徑參數，房間 ID)                  成功時返回成功訊息，無回傳資料。
*/
@RestController
@RequestMapping("/rest")
public class RoomRestController {
	
	@Autowired
	private RoomService roomService;
	
	// 取得所有房間列表
	@GetMapping("/rooms")
	public ApiResponse<List<RoomDTO>> getRooms() {
		List<RoomDTO> roomDTOs = roomService.getAllRooms();
		return ApiResponse.success("查詢所有房間成功", roomDTOs);
	}
	
	// 取得單筆房間
	@GetMapping("/room/{roomId}")
	public ApiResponse<RoomDTO> getRoom(@PathVariable Integer roomId) {
		RoomDTO roomDTO = roomService.getRoomById(roomId);
		return ApiResponse.success("查詢 [ " + roomId + " ] 房間成功", roomDTO);
	}
	
	// 新增房間
	@PostMapping("/room")
	public ApiResponse<Boolean> addRoom(@RequestBody RoomDTO roomDTO) {
		roomService.addRoom(roomDTO);
		return ApiResponse.success("新增房間成功", true);
	}
	
	// 修改房間
	@PutMapping("/room/{roomId}")
	public ApiResponse<Boolean> updateRoom(@PathVariable Integer roomId, @RequestBody RoomDTO roomDTO) {
		roomService.updateRoom(roomId, roomDTO);
		return ApiResponse.success("修改房間成功", true);
	}
	
	// 刪除房間
	@DeleteMapping("/room/{roomId}")
	public ApiResponse<Boolean> deleteRoom(@PathVariable Integer roomId) {
		roomService.deleteRoom(roomId);
		return ApiResponse.success("刪除房間成功", true);
	}
	
	// 例外處理
	@ExceptionHandler({RoomException.class})
	public String handleRoomException(RoomException re) {
		return re.getMessage();
	}
	
}
