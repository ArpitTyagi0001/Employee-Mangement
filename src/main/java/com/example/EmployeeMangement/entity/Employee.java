package com.example.EmployeeMangement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , length=100)
    private String name;

    @Column(nullable = false , unique = true , length = 100)
    private String email;

    @Column(nullable = false , length = 100)
    private String position;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;
}
