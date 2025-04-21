package com.childvaccine.service;

import com.childvaccine.dto.ContactMessageDTO;
import com.childvaccine.entity.ContactMessage;
import com.childvaccine.repository.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactMessageService {
    @Autowired
    private ContactMessageRepository contactMessageRepository;

    public ContactMessage saveMessage(ContactMessageDTO messageDTO) {
        ContactMessage message = new ContactMessage();
        message.setName(messageDTO.getName());
        message.setEmail(messageDTO.getEmail());
        message.setMessage(messageDTO.getMessage());
        return contactMessageRepository.save(message);
    }
}