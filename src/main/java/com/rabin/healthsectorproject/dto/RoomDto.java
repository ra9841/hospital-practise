package com.rabin.healthsectorproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RoomDto {
    private Long roomId;
    private String roomType;
    private String status;
}
