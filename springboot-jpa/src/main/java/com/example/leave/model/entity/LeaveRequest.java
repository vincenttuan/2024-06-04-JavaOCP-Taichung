package com.example.leave.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "leave_request") // 預設資料表名 (此行可以省略)
@Data
public class LeaveRequest {
	
}
