package com.example.EmployeeMangement.Service;

import com.example.EmployeeMangement.Repository.EmployeeRepo;
import com.example.EmployeeMangement.dto.EmployeeDto;
import com.example.EmployeeMangement.entity.Employee;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<EmployeeDto> getAllEmplpoyee() {
        List<Employee> employee = employeeRepo.findAll();

        List<EmployeeDto> employeeDtos = employee.stream()
                .map(employee1 -> modelMapper.map(employee1 , EmployeeDto.class))
                .collect(Collectors.toList());

        return employeeDtos;
    }

    public EmployeeDto getEmployeeById(Long id) {
        Employee employee = employeeRepo.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("Employee Not Found By id :"+id)
        );

        return modelMapper.map(employee , EmployeeDto.class);
    }

    public EmployeeDto addEmployee(EmployeeDto employeeDto) {
        Employee employee = modelMapper.map(employeeDto , Employee.class);

        Employee employeeSave = employeeRepo.save(employee);

        return modelMapper.map(employeeSave , EmployeeDto.class);
    }


    public EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto) {
        Employee employee = employeeRepo.findById(id).orElseThrow(
                ()->new EntityNotFoundException("Employee Not Found By id:" + id)
        );

        modelMapper.map(employeeDto, employee);

        Employee employee1 = employeeRepo.save(employee);

        return modelMapper.map(employee1 , EmployeeDto.class);
    }

    public String deleteEmployee(Long id) {
        Employee employee = employeeRepo.findById(id).orElseThrow(
                ()-> new EntityNotFoundException("Employee Not Found By id:"+ id)
        );

        employeeRepo.delete(employee);

        return "Successfully deleted";
    }
}
