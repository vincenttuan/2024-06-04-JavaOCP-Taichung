package com.example.leave;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leave.repository.LeaveRequestRepository;

@SpringBootTest
public class AddLeaveRequest {
	
	@Autowired
	LeaveRequestRepository leaveRequestRepository;
	
	@Test
	public void test() { 
		// 員編 = 1 要休 2024-12-24 ~ 2024-12-26
		
	}
	
}
