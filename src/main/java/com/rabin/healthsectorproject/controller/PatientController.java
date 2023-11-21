package com.rabin.healthsectorproject.controller;

import com.rabin.healthsectorproject.dto.PatientDto;
import com.rabin.healthsectorproject.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping
    public ResponseEntity<PatientDto> registeringThePatient(@RequestBody PatientDto patientDto){
      return   ResponseEntity.ok(patientService.savingTheRecordOfPatient(patientDto));
    }
}
