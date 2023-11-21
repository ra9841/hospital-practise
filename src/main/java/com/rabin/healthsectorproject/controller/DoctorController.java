package com.rabin.healthsectorproject.controller;

import com.rabin.healthsectorproject.dto.DoctorDto;
import com.rabin.healthsectorproject.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping
    public ResponseEntity<DoctorDto> registeringDoctor(@RequestBody DoctorDto doctorDto){
        return ResponseEntity.ok(doctorService.savingDoctorRecord(doctorDto));
    }


}
