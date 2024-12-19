package com.example.leave;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leave.model.entity.LeaveRequest;
import com.example.leave.repository.LeaveRequestRepository;

@SpringBootTest
public class AddLeaveRequest {
	
	@Autowired
	LeaveRequestRepository leaveRequestRepository;
	
	@Test
	public void test() { 
		// 員編 = 1 要休 2024-12-24 ~ 2024-12-26
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date startDate = sdf.parse("2024-12-24");
			Date endDate = sdf.parse("2024-12-26");
			
			// 建立假單
			LeaveRequest leaveRequest = new LeaveRequest();
			leaveRequest.setEmployeeId(1);
			leaveRequest.setType("特休");
			leaveRequest.setStartDate(startDate);
			leaveRequest.setEndDate(endDate);
			leaveRequest.setReason("耶誕節");
			leaveRequest.setStatus("APPROVED");
			
			// 儲存
			leaveRequestRepository.save(leaveRequest);
			
			System.out.println("新增成功 !");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
