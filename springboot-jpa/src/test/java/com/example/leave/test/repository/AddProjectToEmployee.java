package com.example.leave.test.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leave.model.entity.Employee;
import com.example.leave.model.entity.Project;
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
		try {
			// 取得專案(請先自行查詢資料表的紀錄)
			Project web = projectRepository.findById(1).get();
			Project ppt = projectRepository.findById(2).get();
			Project app = projectRepository.findById(3).get();
			
			// 取得員工(請先自行查詢資料表的紀錄) 
			Employee john = employeeRepository.findById(1).get();
			Employee mary = employeeRepository.findById(3).get();
			Employee david = employeeRepository.findById(4).get();
			
			// 員工自行認領專案
			john.getProjects().add(web);
			john.getProjects().add(ppt);
			john.getProjects().add(app);
			employeeRepository.save(john);
			
			mary.getProjects().add(web);
			mary.getProjects().add(app);
			employeeRepository.save(mary);
			
			david.getProjects().add(ppt);
			employeeRepository.save(david);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
