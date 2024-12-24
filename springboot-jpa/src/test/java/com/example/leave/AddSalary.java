package com.example.leave;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leave.model.entity.Salary;
import com.example.leave.repository.SalaryRepository;

@SpringBootTest
public class AddSalary {
	
	@Autowired
	private SalaryRepository salaryRepository;
	
	@Test
	public void test() {
		// 新增薪資
		Salary salary1 = new Salary();
		salary1.setAmount(75000);
		salaryRepository.save(salary1);
		
		Salary salary2 = new Salary();
		salary2.setAmount(85000);
		salaryRepository.save(salary2);
		
		Salary salary3 = new Salary();
		salary3.setAmount(95000);
		salaryRepository.save(salary3);
		
	}
	
}
