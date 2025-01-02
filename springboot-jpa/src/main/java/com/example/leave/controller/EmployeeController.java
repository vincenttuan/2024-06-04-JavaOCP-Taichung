package com.example.leave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.leave.model.dto.EmployeeDTO;
import com.example.leave.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	// 員工註冊 register / 新增員工
	@GetMapping("/register")
	public String register(EmployeeDTO employeeDTO) {
		return "employee_register";
	}
	
	
}
