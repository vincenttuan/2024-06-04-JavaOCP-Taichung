package com.example.leave.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.leave.model.dto.EmployeeDTO;
import com.example.leave.model.dto.LeaveRequestDTO;
import com.example.leave.model.entity.Employee;
import com.example.leave.model.entity.LeaveRequest;
import com.example.leave.repository.EmployeeRepository;
import com.example.leave.repository.LeaveRequestRepository;

@Service
public class LeaveRequestService {
	@Autowired
	private LeaveRequestRepository leaveRequestRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public void addLeaveRequest(LeaveRequestDTO leaveRequestDTO, Integer employeeId) {
		// leaveRequestDTO 轉 leaveRequest(entity)
		LeaveRequest leaveRequest = modelMapper.map(leaveRequestDTO, LeaveRequest.class);
				
		// 根據 employeeId 取得 employee 物件
		Employee employee = employeeRepository.findById(employeeId).get();
		
		// 設定員工
		leaveRequest.setEmployee(employee);
		
		// 保存(因為 leaveRequest 裡面沒有 id 值所以 save 會進行新增程序)
		leaveRequestRepository.save(leaveRequest);
	}
	
	// 查詢請假紀錄
	public LeaveRequestDTO getLeaveRequestDTO(Integer id) {
		// 取得請假紀錄 Entity
		LeaveRequest leaveRequest = leaveRequestRepository.findById(id).get();
		// 請假紀錄 Entity 轉 DTO
		LeaveRequestDTO leaveRequestDTO = modelMapper.map(leaveRequest, LeaveRequestDTO.class);
		return leaveRequestDTO;
	}
	
	// 修改請假紀錄
	public void updateLeaveRequest(LeaveRequestDTO leaveRequestDTO, Integer employeeId) {
		// leaveRequestDTO 轉 leaveRequest(entity)
		LeaveRequest leaveRequest = modelMapper.map(leaveRequestDTO, LeaveRequest.class);
				
		// 根據 employeeId 取得 employee 物件
		Employee employee = employeeRepository.findById(employeeId).get();
		
		// 設定員工
		leaveRequest.setEmployee(employee);
		
		// 保存(因為 leaveRequest 裡面有 id 值所以 save 會進行修改程序)
		leaveRequestRepository.save(leaveRequest);
	}
	
	// 刪除請假紀錄
	public void deleteLeaveRequest(Integer id) {
		leaveRequestRepository.deleteById(id);
	}
	
	// 查詢今天有哪些員工請假
	
	
	// 查詢指定日期有哪些員工請假
	
	
	// 查詢指定日期區間有哪些員工請假
	
	
	
}
