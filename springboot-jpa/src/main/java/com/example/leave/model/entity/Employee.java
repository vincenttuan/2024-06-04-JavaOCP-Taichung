package com.example.leave.model.entity;

import java.util.Date;
import java.util.List;

import com.example.leave.model.dto.LeaveRequestDTO;
import com.example.leave.model.dto.ProjectDTO;
import com.example.leave.model.dto.SalaryDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity // 此類會在資料庫中建立一個 employee 資料表
@Table(name = "employee") // 將資料表改為指定名稱(預設是類名小寫)
@Getter
@Setter
public class Employee {
	
	@Id // 主鍵欄位
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 連續自動生成 +1 的序號
	private Integer id;
	
	@Column(length = 50, nullable = false, unique = true)
	private String username;
	
	@Column(length = 50, nullable = false)
	private String password;
	
	@Column(nullable = false)
	private Integer annualLeave; // 特休天數
	
	@Column
	@Temporal(TemporalType.DATE) // 僅存日期
	private Date arrivalDate; // 到職日 
	
	@OneToMany(mappedBy = "employee", fetch = FetchType.EAGER) // 查詢員工時也一併連同請假紀錄一起查 
	private List<LeaveRequest> leaveRequests;
	
	@OneToOne
	@JoinColumn(name = "salary_id", nullable = true, referencedColumnName = "id")
	private Salary salary;
	
	@ManyToMany(fetch = FetchType.EAGER) // 查詢員工時也一併連同專案紀錄一起查 
	@JoinTable(
			name = "employee_project", // 關聯表名稱
			joinColumns = @JoinColumn(name = "employee_id"), // 員工 id
			inverseJoinColumns = @JoinColumn(name = "project_id") // 專案 id
	)
	private List<Project> projects; // 員工所參與的專案
	
	// 自行寫 toString 避免未來若有加入關聯產生了資料存取遞迴的風險
	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", password=" + password + ", annualLeave="
				+ annualLeave + ", arrivalDate=" + arrivalDate + "]";
	}
	
	
	
	
}
