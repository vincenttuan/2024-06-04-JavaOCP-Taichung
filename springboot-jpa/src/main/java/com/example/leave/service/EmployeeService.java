package com.example.leave.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.leave.model.dto.EmployeeDTO;
import com.example.leave.model.entity.Employee;
import com.example.leave.model.entity.Project;
import com.example.leave.model.entity.Salary;
import com.example.leave.repository.EmployeeRepository;
import com.example.leave.repository.ProjectRepository;
import com.example.leave.repository.SalaryRepository;

/**
 * 功能服務:
 * 1.查詢所有員工資料
 * 2.查找單筆員工資料
 * 3.新增員工(註冊)
 * 4.員工登入
 * 5.修改員工專案
 * 6.修改員工薪資
 * */

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private SalaryRepository salaryRepository;
	
	@Autowired
	private ProjectRepository projectRepository;
	
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
		salaryRepository.save(salary);
		
		// 再存 employee
		Employee employee = new Employee();
		employee.setUsername(username);
		employee.setPassword(password);
		employee.setArrivalDate(arrivalDate);
		employee.setAnnualLeave(annualLeave);
		employee.setSalary(salary); // 設定薪資
		employeeRepository.save(employee);
	}
	
	// 4.員工登入
	public EmployeeDTO login(String username, String password) {
		// 查詢員工
		Employee employee = employeeRepository.findByUsername(username);
		if(employee == null) {
			throw new IllegalArgumentException("無此帳號:" + username);
		}
		// 確認密碼
		if(!password.equals(employee.getPassword())) {
			throw new IllegalArgumentException("密碼錯誤");
		}
		// 將 Employee 轉 EmployeeDTO
		EmployeeDTO employeeDTO = modelMapper.map(employee, EmployeeDTO.class);
		return employeeDTO;
	}
	
	// 5.修改員工專案
	public void updateProject(Integer employeeId, List<Integer> projectIds) {
		// 查詢員工
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new IllegalArgumentException("無此員編:" + employeeId));
		
		// 找到 projectIds 符合的 projects
		// 並且處理專案為空的情況
		List<Project> projects = (projectIds == null || projectIds.isEmpty()) 
				? List.of() // 空集合
				: projectRepository.findAllById(projectIds);
		
		// 設置專案關聯
		employee.setProjects(projects);
		
		// 保存更新
		employeeRepository.save(employee);
				
	}
	
	// 6. 修改員工薪資
	public void updateSalary(Integer employeeId, Integer amount) {
		// 查詢員工
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new IllegalArgumentException("無此員編:" + employeeId));
		
		// 取得當前員工薪資物件
		Salary salary = employee.getSalary();
		if(salary == null) {
			salary = new Salary();
		}
		
		// 設定薪資
		salary.setAmount(amount);
		// 保存
		salaryRepository.save(salary);
		
		// 設定關聯(將該薪資給此員工)
		employee.setSalary(salary);
		// 保存
		employeeRepository.save(employee);
		
	}
	
}
