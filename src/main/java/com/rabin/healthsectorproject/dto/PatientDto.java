package com.rabin.healthsectorproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PatientDto {
    private Long patientId;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;
    private int age;
    private String disease;
    private String email;
    private String password;
    private String healthInsurancePolicyNumber;
    private String healthInsuranceName;
    private DoctorDto doctorDto;

}
