package com.example.leave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.leave.model.dto.ProjectDTO;
import com.example.leave.service.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@GetMapping
	public String findAllProjects(ProjectDTO projectDTO, Model model) {
		List<ProjectDTO> projectDTOs = projectService.findAllProjectDTOs();
		model.addAttribute("projectDTOs", projectDTOs);
		return "project";
	}
	
	@PostMapping
	public String addProject(ProjectDTO projectDTO) {
		projectService.addProject(projectDTO);
		return "redirect:/project";
	}
	
	
}
