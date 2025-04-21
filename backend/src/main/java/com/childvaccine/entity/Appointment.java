package com.childvaccine.entity;

     import jakarta.persistence.*;
     import lombok.Data;

     @Entity
     @Data
     public class Appointment {
         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
         private Long id;
         private String parentName;
         private String parentEmail;
         private String childName;
         private String date;
         private String serviceType;
     }