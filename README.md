# Employee Leave Management System

A full-stack **Employee Leave Management System** that allows employees to apply for leave and managers to approve or reject leave requests.  
Built using **Spring Boot (Backend)** and **React (Frontend)** with RESTful APIs.

---

## 🚀 Features

### Employee
- Apply for leave
- View leave history
- Track leave status (PENDING / APPROVED / REJECTED)

### Manager
- Approve or reject employee leave requests

### System
- RESTful API architecture
- JSON-based request & response
- Clean MVC + Service + Repository structure

---

## 🛠 Tech Stack

### Backend
- Java (Core Java, OOP)
- Spring Boot
- Spring MVC
- Spring Data JPA (Hibernate)
- MySQL
- REST APIs
- Postman (API Testing)

### Frontend
- React (Vite)
- JavaScript
- HTML & CSS
- Fetch API

---

Employee Leave Management System

The Employee Leave Management System is a full-stack web application designed to automate and streamline the leave management process in an organization.
It replaces manual, paper-based or email-based leave handling with a centralized, role-based digital system.

The system allows employees to apply for leave online and managers to review, approve, or reject leave requests efficiently. All leave data is stored securely in a relational database and accessed through RESTful APIs.

🎯 Problem Statement

In many organizations, leave management is handled manually using emails, spreadsheets, or physical forms. This leads to:

Delays in approval

Data inconsistency

Poor tracking of leave history

Lack of transparency for employees

High administrative effort

This project addresses these issues by providing a structured, scalable, and reliable leave management solution.

💡 Solution Overview

The system is built using a client–server architecture:

Backend (Spring Boot) handles business logic, validations, and database operations.

Frontend (React) provides an interactive user interface.

REST APIs act as the communication layer between frontend and backend.

Each operation such as applying for leave, approving or rejecting leave, and viewing leave history is implemented as a REST API.

🧱 System Architecture
React Frontend
     |
     |  (HTTP / JSON)
     v
Spring Boot REST APIs
     |
     |  (JPA / Hibernate)
     v
MySQL Database


Frontend sends HTTP requests (GET, POST, PUT)

Backend processes requests using service layer

Data is stored and retrieved using JPA repositories

🛠 Technology Explanation
🔹 Java (Core Java)

Used for implementing business logic

Applied OOP concepts:

Encapsulation – entity classes with private fields

Inheritance & Abstraction – service layer design

Polymorphism – flexible method behavior

🔹 Spring Boot

Simplifies application setup and configuration

Provides embedded Tomcat server

Enables rapid development of REST APIs

🔹 Spring MVC

Manages request–response flow

Uses Controllers to map API endpoints

Separates concerns using MVC pattern

🔹 Spring Data JPA (Hibernate)

Handles ORM (Object Relational Mapping)

Converts Java objects into database tables

Reduces boilerplate SQL code

🔹 MySQL

Stores employees, leave requests, and leave balances

Ensures data consistency using relational design

🔹 React

Builds dynamic and responsive user interface

Uses reusable components

Fetch API is used to communicate with backend

📂 Database Design Description
1️⃣ Employee Table

Stores employee details such as:

Employee ID

Name

Email

Role (Employee / Manager)

2️⃣ Leave Request Table

Stores leave application data:

Leave ID

Employee ID (foreign key)

Start and end dates

Reason for leave

Leave status (PENDING, APPROVED, REJECTED)

3️⃣ Leave Balance Table

Tracks:

Total allowed leaves

Used leaves

Remaining leave balance

🔁 Application Workflow
Employee Flow

Employee logs into the system (future enhancement)

Employee applies for leave by selecting dates and reason

Leave request is stored with status PENDING

Employee can view leave history and current status

Manager Flow

Manager views pending leave requests

Manager approves or rejects leave

Leave status is updated in the database

Approved leaves update employee leave balance

🔗 REST API Design

The application follows REST principles:

Uses meaningful URLs

Uses HTTP methods correctly

Stateless communication

JSON-based request and response

Examples:

POST /api/leaves/apply – Apply leave

PUT /api/leaves/update/{id} – Approve/Reject leave

GET /api/leaves/history/{employeeId} – View history

🧪 Testing Approach

APIs are tested using Postman

Validated:

Correct request handling

Proper status updates

JSON responses

Edge cases like invalid IDs and empty data are considered

🔒 Security & Validation (Planned Enhancements)

Role-based access control (Employee vs Manager)

JWT-based authentication

Input validation for dates and leave limits

Global exception handling

📈 Scalability & Maintainability

Layered architecture improves maintainability

JPA enables easy database migration (MySQL → PostgreSQL)

REST APIs allow future mobile or third-party integration

Frontend and backend are loosely coupled

🎓 Learning Outcomes

Through this project, I gained hands-on experience in:

Designing RESTful APIs

Implementing MVC architecture in Spring Boot

Using JPA for database interaction

Integrating React with backend APIs

Understanding real-world enterprise workflows




