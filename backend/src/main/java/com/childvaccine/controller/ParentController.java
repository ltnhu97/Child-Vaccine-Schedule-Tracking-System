package com.childvaccine.controller;

import com.childvaccine.entity.Parent;
import com.childvaccine.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/parents")
@CrossOrigin(origins = "http://localhost:5500")
public class ParentController {

    private final ParentService parentService;

    @Autowired
    public ParentController(ParentService parentService) {
        this.parentService = parentService;
    }

    @PostMapping("/register")
    public ResponseEntity<Parent> register(@RequestBody Parent parent) {
        Parent registeredParent = parentService.registerParent(parent);
        return ResponseEntity.ok(registeredParent);
    }

    @PostMapping("/login")
    public ResponseEntity<Parent> login(@RequestBody Parent parent) {
        Parent loggedInParent = parentService.loginParent(parent.getEmail(), parent.getPassword());
        if (loggedInParent != null) {
            return ResponseEntity.ok(loggedInParent);
        }
        return ResponseEntity.status(401).build();
    }
}