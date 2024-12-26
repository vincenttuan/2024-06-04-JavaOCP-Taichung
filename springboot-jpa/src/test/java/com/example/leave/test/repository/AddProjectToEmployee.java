package com.example.leave.test.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leave.repository.EmployeeRepository;
import com.example.leave.repository.ProjectRepository;

@SpringBootTest
public class AddProjectToEmployee {
	
	@Autowired
	ProjectRepository projectRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Test
	public void test() {
		
	}
	
}
