package com.example.leave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.leave.model.entity.LeaveRequest;


@Repository
public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Integer> {

}
