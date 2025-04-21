package com.childvaccine.service;

import com.childvaccine.entity.Parent;
import com.childvaccine.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ParentService {

    private final ParentRepository parentRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public ParentService(ParentRepository parentRepository, BCryptPasswordEncoder passwordEncoder) {
        this.parentRepository = parentRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Parent registerParent(Parent parent) {
        parent.setPassword(passwordEncoder.encode(parent.getPassword()));
        return parentRepository.save(parent);
    }

    public Parent loginParent(String email, String password) {
        Parent parent = parentRepository.findByEmail(email);
        if (parent != null && passwordEncoder.matches(password, parent.getPassword())) {
            return parent;
        }
        return null;
    }
}