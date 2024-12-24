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
	private String type; // 特休, 病假, 事假
	
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
	
	// 自行寫 toString 避免未來若有加入關聯產生了資料存取遞迴的風險
	@Override
	public String toString() {
		return "LeaveRequest [id=" + id + ", employeeId=" + employeeId + ", type=" + type + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", reason=" + reason + ", status=" + status + "]";
	}
	
	
}
