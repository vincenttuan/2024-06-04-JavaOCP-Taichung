package com.example.leave.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.leave.model.dto.LeaveRequestDTO;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/leave_request")
public class LeaveRequestController {
	// 取得請假資訊
	@GetMapping
	public String getLeaveRequest(@RequestParam(name = "_method") String _method, Model model, HttpSession session) {
		LeaveRequestDTO leaveRequestDTO = null; // 請假 DTO
		switch (_method) {
			case "POST": // 新增
				leaveRequestDTO = new LeaveRequestDTO();
				leaveRequestDTO.setType("特休");
				leaveRequestDTO.setStatus("PENDING");
				break;	
		}
		model.addAttribute("_method", _method);
		model.addAttribute("leaveRequestDTO", leaveRequestDTO);
		return "employee_leave_request";
	}
	
	// 新增請假資訊
	@PostMapping
	public String addLeaveRequest(LeaveRequestDTO leaveRequestDTO) {
		
		return "redirect:/employee";
	}
}
