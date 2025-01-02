package com.example.leave.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.leave.model.dto.EmployeeDTO;
import com.example.leave.model.entity.Employee;
import com.example.leave.model.entity.Salary;
import com.example.leave.repository.EmployeeRepository;
import com.example.leave.repository.SalaryRepository;

/**
 * 功能服務:
 * 1.查詢所有員工資料
 * 2.查找單筆員工資料
 * 3.新增員工(註冊)
 * 
 * */

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private SalaryRepository salaryRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	// 1.查詢所有員工資料
	public List<EmployeeDTO> findAllEmployeeDTOs() {
		// 先從資料庫中抓出 List<Employee>
		List<Employee> employees = employeeRepository.findAll();
		// 利用 ModelMapper 將 Employee 轉 EmployeeDTO
		List<EmployeeDTO> employeeDTOs = employees // List<Employee>
											.stream() // Employee, Employee, Employee ...
											.map(employee -> modelMapper.map(employee, EmployeeDTO.class)) // EmployeeDTO, EmployeeDTO, EmployeeDTO ...
											.toList();  //.collect(Collectors.toList());
		return employeeDTOs;
	}
	
	// 2.查找單筆員工資料
	public EmployeeDTO getEmployeeDTOById(Integer id) {
		Optional<Employee> optEmployee = employeeRepository.findById(id);
		if(optEmployee.isEmpty()) {
			throw new RuntimeException("找不到員工 ID: " + id);
		}
		Employee employee = optEmployee.get();
		// 將 Employee 轉 EmployeeDTO
		EmployeeDTO employeeDTO = modelMapper.map(employee, EmployeeDTO.class);
		return employeeDTO;
	}
	
	// 3.新增員工(註冊)
	public void addEmployee(String username, String password, Integer salaryAmount, Date arrivalDate, Integer annualLeave) {
		// 先儲存 salary
		Salary salary = new Salary();
		salary.setAmount(salaryAmount);
		salaryRepository.
		
	}
	
	
}
