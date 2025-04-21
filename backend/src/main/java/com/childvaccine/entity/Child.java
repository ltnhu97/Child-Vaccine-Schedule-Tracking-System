package com.childvaccine.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate birthdate;
    private String gender;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;
}