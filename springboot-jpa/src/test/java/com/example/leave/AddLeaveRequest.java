package com.example.leave;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

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
		// 員編 = 1 要休 2024-12-24 ~ 2024-12-26 聖誕節
		// 員編 = 1 要休 2024-12-30 ~ 2024-12-31 跨年
		// 員編 = 3 要休 2024-12-30 ~ 2024-12-31 跨年
		try {
			// 將員工編號的資料取出
			Optional<Employee> optEmployee = employeeRepository.findById(3);
			if(optEmployee.isEmpty()) {
				System.out.println("員工不存在");
				return;
			}
			Employee employee = optEmployee.get();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date startDate = sdf.parse("2024-12-30");
			Date endDate = sdf.parse("2024-12-31");
			
			// 建立假單
			LeaveRequest leaveRequest = new LeaveRequest();
			leaveRequest.setEmployee(employee);
			leaveRequest.setType("特休");
			leaveRequest.setStartDate(startDate);
			leaveRequest.setEndDate(endDate);
			leaveRequest.setReason("跨年");
			leaveRequest.setStatus("APPROVED");
			
			// 儲存
			leaveRequestRepository.save(leaveRequest);
			
			System.out.println("新增成功 !");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
