package com.example.EmployeeMangement.Controller;

import com.example.EmployeeMangement.Service.EmployeeService;
import com.example.EmployeeMangement.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/AllEmployee")
    public List<EmployeeDto> getAllEmployee(){
        return employeeService.getAllEmplpoyee();
    }

    @GetMapping("/EmployeeByID/{id}")
    public EmployeeDto getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }
}
