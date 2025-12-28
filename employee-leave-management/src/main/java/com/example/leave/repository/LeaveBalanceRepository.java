package com.example.leave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.leave.entity.LeaveBalance;

public interface LeaveBalanceRepository extends JpaRepository<LeaveBalance, Long> {
    LeaveBalance findByEmployeeId(Long employeeId);
}
