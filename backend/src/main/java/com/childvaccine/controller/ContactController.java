package com.childvaccine.controller;

import com.childvaccine.dto.ContactMessageDTO;
import com.childvaccine.entity.ContactMessage;
import com.childvaccine.service.ContactMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
public class ContactController {
    @Autowired
    private ContactMessageService contactMessageService;

    @PostMapping
    public ResponseEntity<ContactMessage> saveMessage(@RequestBody ContactMessageDTO messageDTO) {
        return ResponseEntity.ok(contactMessageService.saveMessage(messageDTO));
    }
}