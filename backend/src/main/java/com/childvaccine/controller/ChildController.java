package com.childvaccine.controller;

import com.childvaccine.dto.ChildDTO;
import com.childvaccine.entity.Child;
import com.childvaccine.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/children")
public class ChildController {
    @Autowired
    private ChildService childService;

    @PostMapping
    public ResponseEntity<Child> addChild(@RequestBody ChildDTO childDTO) {
        return ResponseEntity.ok(childService.addChild(childDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Child> updateChild(@PathVariable Long id, @RequestBody ChildDTO childDTO) {
        return ResponseEntity.ok(childService.updateChild(id, childDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChild(@PathVariable Long id) {
        childService.deleteChild(id);
        return ResponseEntity.ok().build();
    }
}