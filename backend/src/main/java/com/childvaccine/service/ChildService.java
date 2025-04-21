package com.childvaccine.service;

import com.childvaccine.dto.ChildDTO;
import com.childvaccine.entity.Child;
import com.childvaccine.entity.Parent;
import com.childvaccine.repository.ChildRepository;
import com.childvaccine.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class ChildService {
    @Autowired
    private ChildRepository childRepository;
    @Autowired
    private ParentRepository parentRepository;

    public Child addChild(ChildDTO childDTO) {
        Optional<Parent> parent = parentRepository.findById(childDTO.getParentId());
        if (parent.isPresent()) {
            Child child = new Child();
            child.setName(childDTO.getName());
            child.setBirthdate(LocalDate.parse(childDTO.getBirthdate()));
            child.setGender(childDTO.getGender());
            child.setParent(parent.get());
            return childRepository.save(child);
        }
        throw new RuntimeException("Parent not found");
    }

    public Child updateChild(Long id, ChildDTO childDTO) {
        Optional<Child> childOpt = childRepository.findById(id);
        if (childOpt.isPresent()) {
            Child child = childOpt.get();
            child.setName(childDTO.getName());
            child.setBirthdate(LocalDate.parse(childDTO.getBirthdate()));
            child.setGender(childDTO.getGender());
            return childRepository.save(child);
        }
        throw new RuntimeException("Child not found");
    }

    public void deleteChild(Long id) {
        childRepository.deleteById(id);
    }
}