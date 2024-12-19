package com.example.leave;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leave.repository.EmployeeRepository;

@SpringBootTest
public class DeleteEmployee {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Test
	public void test() {
		try {
			// 刪除
			employeeRepository.deleteById(6);
			
			System.out.println("刪除成功");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
