package com.example.EmployeeMangement.Controller;

import com.example.EmployeeMangement.Repository.EmployeeRepo;
import com.example.EmployeeMangement.Service.EmployeeService;
import com.example.EmployeeMangement.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addEmployee")
    public EmployeeDto addEmployee(@RequestBody EmployeeDto employeeDto){
        return employeeService.addEmployee(employeeDto);
    }

    @PutMapping("/updateEmployee/{id}")
    public EmployeeDto updateEmployee(@PathVariable Long id , @RequestBody  EmployeeDto employeeDto){
        return employeeService.updateEmployee(id , employeeDto);
    }
}
