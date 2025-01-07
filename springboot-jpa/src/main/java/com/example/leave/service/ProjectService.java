package com.example.leave.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.leave.model.dto.ProjectDTO;
import com.example.leave.model.entity.Project;
import com.example.leave.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	// 查詢所有專案
	public List<ProjectDTO> findAllProjectDTOs() {
		return projectRepository.findAll()   // [Project, Project ...]
								.stream()    // Project, Project ...
								.map(project -> modelMapper.map(project, ProjectDTO.class)) // ProjectDTO, ProjectDTO ...
								.toList();   // [ProjectDTO, ProjectDTO ...]
	}
	
	// 新增專案
	public void addProject(ProjectDTO projectDTO) {
		Project project = modelMapper.map(projectDTO, Project.class);
		projectRepository.save(project);
	}
	
}
