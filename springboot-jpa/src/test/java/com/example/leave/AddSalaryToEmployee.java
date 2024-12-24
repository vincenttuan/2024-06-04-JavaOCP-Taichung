package com.example.leave;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leave.model.entity.Employee;
import com.example.leave.model.entity.Salary;
import com.example.leave.repository.EmployeeRepository;
import com.example.leave.repository.SalaryRepository;

@SpringBootTest
public class AddSalaryToEmployee {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	SalaryRepository salaryRepository;
	
	@Test
	public void test() {
		// 配置薪資
		// 取得要配置薪資的員工
		Employee employee = employeeRepository.findById(1).get();
		// 取得要給員工配置的薪資
		Salary salary = salaryRepository.findById(1).get();
		
		// 配對
		employee.setSalary(salary);
		
		// 儲存
		employeeRepository.save(employee);
	}
	
}
