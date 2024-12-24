package com.example.leave;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leave.model.entity.Employee;
import com.example.leave.model.entity.LeaveRequest;
import com.example.leave.repository.EmployeeRepository;

@SpringBootTest
public class QueryEmployee {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Test
	public void test() {
//		List<Employee> employees = employeeRepository.findAll();
//		for(Employee emp : employees) {
//			System.out.println(emp);
//		}
		// 查詢員工編號=1的員工資料與請假紀錄
		Optional<Employee> optEmployee = employeeRepository.findById(1);
		if(optEmployee.isEmpty()) {
			System.out.println("無此員工");
			return;
		}
		
		Employee employee = optEmployee.get();
		System.out.println("員工編號:" + employee.getId());
		System.out.println("員工姓名:" + employee.getUsername());
		System.out.println("特休天數:" + employee.getAnnualLeave());
		// 請假紀錄
		List<LeaveRequest> leaves = employee.getLeaveRequests();
		System.out.println("請假紀錄筆數:" + leaves.size());
		System.out.println("請假紀錄:");
		System.out.println("======================");
		for(LeaveRequest leave : leaves) {
			System.out.println(leave.getType() + " " + 
					leave.getStartDate() + " ~ " + leave.getEndDate() + " " + 
					leave.getReason() + " " + 
					leave.getStatus());
		}
		
		
	}
	
}
