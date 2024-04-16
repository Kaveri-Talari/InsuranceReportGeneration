package com.insurance.insurance.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name="CITIZEN_PLANS_INFO")
public class CitizenPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer citizenId;
    private String citizenName;
    private String gender;
    private String planName;
    private String planStatus;
    private LocalDate planStartDate;
    private LocalDate planEndDate;
    private Double benefitAmount;
    private  String denialReason;
    private LocalDate terminationDate;
    private String terminationReason;
}
