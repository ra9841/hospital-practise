package com.rabin.healthsectorproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BillDto {
    private Long billId;
    private int medicineCharge;
    private int labCharge;
    private int operationCharge;
    private String patientType;
    private String healthCard;
    private int numberOfDays;
}
