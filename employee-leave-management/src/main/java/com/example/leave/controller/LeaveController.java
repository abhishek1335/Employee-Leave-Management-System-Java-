package com.example.leave.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.leave.entity.LeaveRequest;
import com.example.leave.service.LeaveService;

@RestController
@RequestMapping("/api/leaves")
public class LeaveController {

    private final LeaveService service;

    public LeaveController(LeaveService service) {
        this.service = service;
    }

    // Apply Leave
    @PostMapping("/apply")
    public LeaveRequest applyLeave(@RequestBody LeaveRequest leave) {
        return service.applyLeave(leave);
    }

    // Approve / Reject Leave
    @PutMapping("/update/{id}")
    public LeaveRequest updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        return service.approveLeave(id, status);
    }

    // View Leave History
    @GetMapping("/history/{employeeId}")
    public List<LeaveRequest> history(@PathVariable Long employeeId) {
        return service.getLeaveHistory(employeeId);
    }
}
