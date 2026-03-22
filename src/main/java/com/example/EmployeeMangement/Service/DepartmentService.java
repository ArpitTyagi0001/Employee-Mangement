package com.example.EmployeeMangement.Service;

import com.example.EmployeeMangement.Repository.DepartmentRepo;
import com.example.EmployeeMangement.dto.DepartmentDto;
import com.example.EmployeeMangement.entity.Department;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<DepartmentDto> getAllDepartment() {
        List<Department> departments = departmentRepo.findAll();

        List<DepartmentDto> departmentDtos = departments.stream()
                .map(department -> modelMapper.map(department , DepartmentDto.class))
                .collect(Collectors.toList());

        return departmentDtos;
    }

    public DepartmentDto getDepartmentById(Long id) {
        Department department = departmentRepo.findById(id).orElseThrow(
                ()->new EntityNotFoundException("Department Not Found By Id : " + id)
        );

        return modelMapper.map(department , DepartmentDto.class);
    }
}
