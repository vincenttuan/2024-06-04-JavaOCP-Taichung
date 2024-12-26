package com.example.leave.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.leave.model.dto.EmployeeDTO;
import com.example.leave.model.entity.Employee;
import com.example.leave.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	// 查詢所有員工資料
	public List<EmployeeDTO> findAllEmployeeDTOs() {
		// 先從資料庫中抓出 List<Employee>
		List<Employee> employees = employeeRepository.findAll();
		// 利用 ModelMapper 將 Employee 轉 EmployeeDTO
		List<EmployeeDTO> employeeDTOs = employees // List<Employee>
											.stream() // Employee, Employee, Employee ...
											.map(employee -> modelMapper.map(employee, EmployeeDTO.class)) // EmployeeDTO, EmployeeDTO, EmployeeDTO ...
											.toList(); // List<EmployeeDTO>
		return employeeDTOs;
	
	}
	
}
