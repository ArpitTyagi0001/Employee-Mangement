package com.example.EmployeeMangement.Repository;

import com.example.EmployeeMangement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee , Long> {
}
