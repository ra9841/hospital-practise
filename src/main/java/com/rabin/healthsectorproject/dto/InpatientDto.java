package com.rabin.healthsectorproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InpatientDto {
    private Long inpatientId;
    private Date dateOfAdmission;
    private int roomNo;
    private Date dateOfDischarge;
}
