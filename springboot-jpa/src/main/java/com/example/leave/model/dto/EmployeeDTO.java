package com.example.leave.model.dto;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class EmployeeDTO {
	
	private Integer id;
	
	private String username;
	
	private Integer annualLeave; // 特休天數
	
	private Date arrivalDate; // 到職日
	
	private SalaryDTO salary;
	
	private List<LeaveRequestDTO> leaveRequests;
	
	private List<ProjectDTO> projects;
	
	
}
