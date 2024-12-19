package com.example.leave.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity // 此類會在資料庫中建立一個 employee 資料表
@Table(name = "employee") // 將資料表改為指定名稱(預設是類名小寫)

public class Employee {
	
	private Integer id;
	
	private String username;
	
	private String password;
	
	private Integer annualLeave; // 特休天數
	
}
