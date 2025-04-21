package com.childvaccine.dto;

import lombok.Data;

@Data
public class AppointmentDTO {
    private Long id;
    private String date;
    private String serviceType;
    private Long childId;
}