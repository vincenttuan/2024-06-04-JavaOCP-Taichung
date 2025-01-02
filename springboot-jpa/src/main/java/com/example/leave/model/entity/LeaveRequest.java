package com.example.leave.model.entity;

import java.util.Date;
import java.util.List;

import com.example.leave.model.dto.LeaveRequestDTO;
import com.example.leave.model.dto.ProjectDTO;
import com.example.leave.model.dto.SalaryDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "leave_request") // 預設資料表名 (此行可以省略)
@Getter
@Setter
public class LeaveRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//@Column(nullable = false)
	//private Integer employeeId;
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
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
		return "LeaveRequest [id=" + id + ", type=" + type + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", reason=" + reason + ", status=" + status + "]";
	}
	
}
