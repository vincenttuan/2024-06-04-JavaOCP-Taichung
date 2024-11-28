package com.example.demo.controller;

import org.springframework.stereotype.Controller;

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
public class RoomController {

}
