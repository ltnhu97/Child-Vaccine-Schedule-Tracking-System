package com.childvaccine.repository;

import com.childvaccine.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent, Long> {
    Parent findByEmail(String email);
}