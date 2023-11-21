package com.rabin.healthsectorproject.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DoctorDto {
    private Long doctorId;
    private String doctorName;
    private String dept;
   private String doctorEPNumber;
    private List<PatientDto> patients;
}
