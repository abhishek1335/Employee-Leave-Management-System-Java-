package com.example.leave.entity;

import jakarta.persistence.*;

@Entity
public class LeaveBalance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId;
    private int totalLeaves;
    private int usedLeaves;

    // getters & setters
}
