package com.example.leave.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.leave.model.entity.LeaveRequest;


@Repository
public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Integer> {
	// 查詢某員工的請假資料
	// 使用標準 SQL 語言
	// nativeQuery=true 表示是使用標準 sql 語言
	@Query(value = "select * from leave_request where employee_id = :employeeId", nativeQuery=true)
	List<LeaveRequest> query1(Integer employeeId);
	
	// 使用 JPA 所提供的 JPQL 語言
	@Query("select r from LeaveRequest r where r.employeeId = :employeeId")
	List<LeaveRequest> query2(Integer employeeId);
	
	// 使用 JPA 提供的簡易方法命名(不需要 SQL 或 JPQL)
	List<LeaveRequest> findByEmployeeId(Integer employeeId);
	
	// 查詢在指定日期間的請假資料
	@Query(value = "select * from leave_request where start_date <= :date1 and end_date >= :date2", nativeQuery=true)
	List<LeaveRequest> query3(LocalDate date1, LocalDate date2);
	
	// Homework 把 JPQL 與 簡易方法命名寫出
}
