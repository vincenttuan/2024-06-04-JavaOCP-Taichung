package com.example.leave;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leave.model.entity.Employee;
import com.example.leave.repository.EmployeeRepository;

@SpringBootTest
public class UpdateEmployee {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Test
	public void test() {
		try {
			// 修改
			Optional<Employee> optEmployee = employeeRepository.findById(3);
			if(optEmployee.isEmpty()) {
				System.out.println("查無此人");
				return;
			}
			Employee employee = optEmployee.get();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date arrivalDate = sdf.parse("2021-03-08");
			// 設定到職日
			employee.setArrivalDate(arrivalDate);
			// 儲存
			employeeRepository.save(employee);
			System.out.println("設定完成");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
