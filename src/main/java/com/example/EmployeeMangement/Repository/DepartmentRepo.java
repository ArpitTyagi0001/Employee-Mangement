package com.example.EmployeeMangement.Repository;

import com.example.EmployeeMangement.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department , Long>{
}
