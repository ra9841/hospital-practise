package com.rabin.healthsectorproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LabReportDto {
    private Long labId;
    private String category;
    private int labNo;

}
