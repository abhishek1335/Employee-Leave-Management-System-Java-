package com.example.leave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.leave.entity.LeaveRequest;
import java.util.List;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long> {
    List<LeaveRequest> findByEmployeeId(Long employeeId);
}
