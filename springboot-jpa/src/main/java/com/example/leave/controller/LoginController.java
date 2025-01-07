package com.example.leave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.leave.model.dto.EmployeeDTO;
import com.example.leave.service.EmployeeService;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	
	@Autowired
	private EmployeeService employeeService;
	
	// 得到一個 login 網頁
	@GetMapping("/login")
	public String login() {
		return "login"; // 登入畫面 jsp
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate(); // session 失效
		return "redirect:/login"; // client 端重導 (HTTP 301)
	}
	
	// 驗證 username / password 
	@PostMapping("/login")
	public String login(@RequestParam(name = "username") String username,
						@RequestParam(name = "password") String password,
						HttpSession session) {
		
		EmployeeDTO employeeDTO = employeeService.login(username, password);
		session.setAttribute("employeeDTO", employeeDTO); // 登入資訊
		return "redirect:/employee";
	}
	
	
	
}
