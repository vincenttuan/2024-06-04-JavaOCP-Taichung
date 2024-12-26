package com.example.leave.test.repository;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leave.model.entity.Employee;
import com.example.leave.repository.EmployeeRepository;

@SpringBootTest
public class AddEmployee {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Test
	public void test() {
		try {
			// 設定到職日
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date arrivalDate = sdf.parse("2024-12-19");
			
			// 建立一個 employee 物件
			Employee employee = new Employee();
			employee.setUsername("David");
			employee.setPassword("1234");
			employee.setAnnualLeave(7);
			employee.setArrivalDate(arrivalDate);
			
			// save() 新增/修改 (JPA 會自行判斷)
			employeeRepository.save(employee);
			
			System.out.println("新增完成");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
