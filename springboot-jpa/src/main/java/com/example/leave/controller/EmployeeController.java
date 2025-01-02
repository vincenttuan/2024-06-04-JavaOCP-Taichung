package com.example.leave.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.leave.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	// 員工註冊 register / 新增員工
	@GetMapping("/register")
	public String register() {
		return "employee_register"; // 員工註冊 jsp
	}
	
	// 員工註冊 (接收 employee_register.jsp 員工註冊 jsp 表單傳來的資訊)
	@PostMapping("/register")
	public String addEmployee(@RequestParam(name = "username") String username, 
			@RequestParam(name = "password") String password, 
			@RequestParam(name = "salaryAmount") Integer salaryAmount, 
			@RequestParam(name = "arrivalDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date arrivalDate, 
			@RequestParam(name = "annualLeave") Integer annualLeave,
			Model model) {
		
		employeeService.addEmployee(username, password, salaryAmount, arrivalDate, annualLeave);
		
		model.addAttribute("message", "員工註冊成功");
		return "result";
	}
	
	
}
