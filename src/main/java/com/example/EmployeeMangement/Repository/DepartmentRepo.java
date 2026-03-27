package com.example.EmployeeMangement.Repository;

import com.example.EmployeeMangement.entity.Department;
import com.example.EmployeeMangement.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department , Long>{
    @Repository
    interface UsersRepo extends JpaRepository<Users, Long> {
        Users findByUsername(String username);
    }
}
