package com.example.EmployeeMangement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , length = 100)
    private String name;

    @OneToMany(mappedBy = "department" , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Employee> employees = new ArrayList<>();
}
