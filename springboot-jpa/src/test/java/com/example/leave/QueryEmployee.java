package com.example.leave;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leave.model.entity.Employee;
import com.example.leave.repository.EmployeeRepository;

@SpringBootTest
public class QueryEmployee {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Test
	public void test() {
		List<Employee> employees = employeeRepository.findAll();
		for(Employee emp : employees) {
			System.out.println(emp);
		}
		
	}
	
}
