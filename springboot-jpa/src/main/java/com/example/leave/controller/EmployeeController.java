package com.example.leave.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.leave.model.dto.EmployeeDTO;
import com.example.leave.model.dto.ProjectDTO;
import com.example.leave.service.EmployeeService;
import com.example.leave.service.ProjectService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private ProjectService projectService;
	
	// 員工註冊 register / 新增員工
	@GetMapping("/register")
	public String register() {
		return "employee_register"; // 員工註冊 jsp
	}
	
	// 取得員工資料
	@GetMapping 
	public String findAllEmployees(Model model) {
		List<EmployeeDTO> employeeDTOs = employeeService.findAllEmployeeDTOs();
		
		model.addAttribute("employeeDTOs", employeeDTOs);
		return "employee";
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
	
	// 取得員工(已登入)專案
	@GetMapping("/project")
	public String getEmployeeProject(Model model, HttpSession session) {
		// 員工資料
		EmployeeDTO employeeDTO = (EmployeeDTO)session.getAttribute("employeeDTO");
		// 所有專案資料
		List<ProjectDTO> projectDTOs = projectService.findAllProjectDTOs();
		
		model.addAttribute("employeeDTO", employeeDTO); // 給表單的 modelAttribute 使用
		model.addAttribute("projectDTOs", projectDTOs);
		return "employee_project"; // <-- jsp file
	}
	
	// 修改員工專案
	@PostMapping("/project")
	public String updateEmployeeProject(@RequestParam(name = "projectIds") List<Integer> projectIds) {
		
		projectIds.forEach(System.out::println);
		
		return "redirect:/employee";
	}
	
	
	
}
