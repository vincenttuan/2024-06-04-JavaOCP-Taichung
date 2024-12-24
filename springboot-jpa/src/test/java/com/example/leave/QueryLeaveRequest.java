package com.example.leave;

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
		
		
		
	}
	
}
