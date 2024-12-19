package com.example.leave.model.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "leave_request") // 預設資料表名 (此行可以省略)
@Data
public class LeaveRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private Integer employeeId;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@Column(length = 255)
	private String reason;
	
	@Column(length = 10, nullable = false)
	private String status = "PENDING"; // PENDING、APPROVED、REJECTED
	
	
	
	
}
