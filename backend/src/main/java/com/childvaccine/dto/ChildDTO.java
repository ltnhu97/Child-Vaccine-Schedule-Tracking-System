package com.childvaccine.dto;

import lombok.Data;

@Data
public class ChildDTO {
    private Long id;
    private String name;
    private String birthdate;
    private String gender;
    private Long parentId;
}