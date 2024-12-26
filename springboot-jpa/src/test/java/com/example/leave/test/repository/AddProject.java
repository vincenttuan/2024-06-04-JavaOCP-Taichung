package com.example.leave.test.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leave.model.entity.Project;
import com.example.leave.repository.ProjectRepository;

@SpringBootTest
public class AddProject {
	
	@Autowired
	ProjectRepository projectRepository;
	
	@Test
	public void test() {
		
		Project project = new Project();
		project.setName("App");
		
		projectRepository.save(project);
		
		
	}
	
	
}
