package com.example.leave.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.leave.model.dto.EmployeeDTO;
import com.example.leave.model.dto.LeaveRequestDTO;
import com.example.leave.service.LeaveRequestService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/leave_request")
public class LeaveRequestController {
	
	@Autowired
	private LeaveRequestService leaveRequestService;
	
	// 查詢請假資訊
	@GetMapping("/find")
	public String findLeaveRequest(@RequestParam(name = "startDate", required = false) LocalDate startDate,
								   @RequestParam(name = "endDate", required = false) LocalDate endDate,	
								   Model model) {
		
		List<EmployeeDTO> employeeDTOs = null; // 請假人員集合
		// 若 startDate == null 與 endDate == null 表示要取得今日請假人員
		if(startDate == null && endDate == null) { // 今日
			startDate = LocalDate.now();
			employeeDTOs = leaveRequestService.getEmployeesOnLeaveToday();
		} else if(startDate != null && endDate == null) { // 指定日期
			employeeDTOs = leaveRequestService.getEmployeesOnLeave(startDate);
		} else { // 指定日期區間
			employeeDTOs = leaveRequestService.getEmployeesOnLeave(startDate, endDate);
		}
		
		model.addAttribute("startDate", startDate);
		model.addAttribute("endDate", endDate);
		model.addAttribute("employeeDTOs", employeeDTOs);
		
		return "leave";
	}
	
	// 取得請假資訊
	@GetMapping
	public String getLeaveRequest(@RequestParam(name = "_method") String _method, 
								  @RequestParam(name = "id", required = false) Integer id,
								  Model model, HttpSession session) {
		LeaveRequestDTO leaveRequestDTO = null; // 請假 DTO
		switch (_method) {
			case "POST": // 新增
				leaveRequestDTO = new LeaveRequestDTO();
				leaveRequestDTO.setType("特休");
				leaveRequestDTO.setStatus("PENDING");
				break;	
			case "PUT": // 修改
			case "DELETE": // 刪除	
				// 根據 id 找到請假紀錄
				leaveRequestDTO = leaveRequestService.getLeaveRequestDTO(id);
				break;
				
		}
		
		String submitButtonName = _method.equals("POST") ? "新增" : _method.equals("PUT") ? "修改" : "刪除";
		String[] types = {"特休", "病假", "事假", "公假"};
		
		model.addAttribute("_method", _method);
		model.addAttribute("submitButtonName", submitButtonName);
		model.addAttribute("leaveRequestDTO", leaveRequestDTO);
		model.addAttribute("types", types);
		return "employee_leave_request";
	}
	
	// 新增請假資訊
	@PostMapping
	public String addLeaveRequest(LeaveRequestDTO leaveRequestDTO, HttpSession session) {
		EmployeeDTO employeeDTO = (EmployeeDTO)session.getAttribute("employeeDTO");
		leaveRequestService.addLeaveRequest(leaveRequestDTO, employeeDTO.getId());
		return "redirect:/employee";
	}
	
	// 修改請假資訊
	@PutMapping
	public String updateLeaveRequest(LeaveRequestDTO leaveRequestDTO, HttpSession session) {
		// 注意:要進行修改時 LeaveRequestDTO 裡面一定要有 id
		System.out.println("修改 LeaveRequestDTO.id = " + leaveRequestDTO.getId());
		EmployeeDTO employeeDTO = (EmployeeDTO)session.getAttribute("employeeDTO");
		leaveRequestService.updateLeaveRequest(leaveRequestDTO, employeeDTO.getId());
		return "redirect:/employee";
	}
	
	// 刪除請假紀錄
	@DeleteMapping
	public String deleteLeaveRequest(@RequestParam(name = "id") Integer id) {
		leaveRequestService.deleteLeaveRequest(id);
		return "redirect:/employee";
	} 
}
