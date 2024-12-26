package com.example.leave.test.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leave.model.entity.LeaveRequest;
import com.example.leave.repository.LeaveRequestRepository;

@SpringBootTest
public class QueryLeaveRequest {
	
	@Autowired
	private LeaveRequestRepository leaveRequestRepository;
	
	@Test
	public void test() {
		// 查詢全部請假紀錄
		List<LeaveRequest> leaves = leaveRequestRepository.findAll();
		System.out.println("資料筆數:" + leaves.size());
		// 資料列出
		for(LeaveRequest leave : leaves) {
			System.out.print("員工編號:" +  leave.getEmployee().getId());
			System.out.print(" 員工姓名:" +  leave.getEmployee().getUsername());
			System.out.print(" 請假開始:" +  leave.getStartDate());
			System.out.print(" 請假結束:" +  leave.getEndDate());
			System.out.println(" 假單狀態:" +  leave.getStatus());
			
		}
		
		
	}
	
}
