package com.example.leave.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.leave.model.entity.LeaveRequest;


@Repository
public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Integer> {
	// 查詢某員工的請假資料
	// nativeQuery=true 表示是使用標準 sql 語言
	@Query(value = "select * from leave_request where employee_id = :employeeId", nativeQuery=true)
	List<LeaveRequest> query1(Integer employeeId);
	
	
	
	// 查詢在指定日期間的請假資料
	
}
