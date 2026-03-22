package com.example.EmployeeMangement.Controller;

import com.example.EmployeeMangement.Service.DepartmentService;
import com.example.EmployeeMangement.dto.DepartmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/AllDepartment")
    public List<DepartmentDto> getALlDepartment(){
        return departmentService.getAllDepartment();
    }

    @GetMapping("/getDepartmentById/{id}")
    public DepartmentDto getDepartmentById(@PathVariable Long id){
        return departmentService.getDepartmentById(id);
    }
}
