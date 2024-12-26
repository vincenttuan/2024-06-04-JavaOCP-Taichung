package com.example.leave.test.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leave.model.dto.EmployeeDTO;
import com.example.leave.service.EmployeeService;

@SpringBootTest
public class TestEmployeeService {
	
	@Autowired
	EmployeeService employeeService;
	
	@Test
	public void findAll() {
		System.out.println("多筆查詢:");
		List<EmployeeDTO> employeeDTOs = employeeService.findAllEmployeeDTOs();
		System.out.println("筆數:" + employeeDTOs.size());
		employeeDTOs.forEach(System.out::println);
	}
	
	@Test
	public void getOne() {
		System.out.println("單筆查詢:");
		EmployeeDTO employeeDTO = employeeService.getEmployeeDTOById(1);
		System.out.println(employeeDTO);
	}
	
	
}
