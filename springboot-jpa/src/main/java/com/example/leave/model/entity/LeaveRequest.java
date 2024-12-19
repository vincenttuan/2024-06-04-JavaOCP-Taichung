package com.example.leave.model.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "leave_request") // 預設資料表名 (此行可以省略)
@Data
public class LeaveRequest {
	
	private Integer id;
	
	private Integer employeeId;
	
	private Date startDate;
	
	private Date endDate;
	
	private String reason;
	
	private String status; // PENDING、APPROVED、REJECTED

	
	
}
