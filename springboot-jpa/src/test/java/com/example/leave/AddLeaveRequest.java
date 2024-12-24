package com.example.leave;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.leave.model.entity.Employee;
import com.example.leave.model.entity.LeaveRequest;
import com.example.leave.repository.EmployeeRepository;
import com.example.leave.repository.LeaveRequestRepository;

@SpringBootTest
public class AddLeaveRequest {
	
	@Autowired
	LeaveRequestRepository leaveRequestRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Test
	public void test() { 
		// 員編 = 1 要休 2024-12-24 ~ 2024-12-26
		// 員編 = 1 要休 2024-12-30 ~ 2024-12-31
		// 員編 = 3 要休 2024-12-30 ~ 2024-12-31
		try {
			// 將員工編號 = 1 的資料取出
			Employee employee = employeeRepository.findById(1).get();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date startDate = sdf.parse("2024-12-24");
			Date endDate = sdf.parse("2024-12-26");
			
			// 建立假單
			LeaveRequest leaveRequest = new LeaveRequest();
			leaveRequest.setEmployee(employee);
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
