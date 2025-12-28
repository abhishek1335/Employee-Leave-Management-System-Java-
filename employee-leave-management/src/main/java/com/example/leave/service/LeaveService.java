package com.example.leave.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.leave.entity.LeaveRequest;
import com.example.leave.repository.LeaveRequestRepository;

@Service
public class LeaveService {

    private final LeaveRequestRepository repo;

    public LeaveService(LeaveRequestRepository repo) {
        this.repo = repo;
    }

    public LeaveRequest applyLeave(LeaveRequest leave) {
        leave.setStatus("PENDING");
        return repo.save(leave);
    }

    public LeaveRequest approveLeave(Long id, String status) {
        LeaveRequest leave = repo.findById(id).orElseThrow();
        leave.setStatus(status);
        return repo.save(leave);
    }

    public List<LeaveRequest> getLeaveHistory(Long employeeId) {
        return repo.findByEmployeeId(employeeId);
    }
}
