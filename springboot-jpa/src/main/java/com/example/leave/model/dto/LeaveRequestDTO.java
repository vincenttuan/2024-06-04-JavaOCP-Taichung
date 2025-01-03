package com.example.leave.model.dto;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LeaveRequestDTO {
	private Integer id;
	private String type; // 特休, 病假, 事假
	private Date startDate;
	private Date endDate;
	private String reason;
	private String status; // "PENDING", "APPROVED", "REJECTED"
	
	// 計算請假天數
	public long getLeaveDays() {
		long leaveDays = (endDate.getTime() - startDate.getTime())/(60*60*24*1000);
		return leaveDays;
	}
}
