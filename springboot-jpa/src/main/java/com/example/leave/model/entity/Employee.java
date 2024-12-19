package com.example.leave.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity // 此類會在資料庫中建立一個 employee 資料表
@Table(name = "employee") // 將資料表改為指定名稱(預設是類名小寫)
@Data
public class Employee {
	
	@Id // 主鍵欄位
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 連續自動生成 +1 的序號
	private Integer id;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	private Integer annualLeave; // 特休天數
	
	// 自行寫 toString 避免未來若有加入關聯產生了資料存取遞迴的風險
	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", password=" + password + ", annualLeave="
				+ annualLeave + "]";
	}
	
}
