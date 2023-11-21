package com.rabin.healthsectorproject.service;

import com.rabin.healthsectorproject.dto.DoctorDto;

public interface DoctorService {
    DoctorDto savingDoctorRecord(DoctorDto doctorDto);


    DoctorDto assigningPatientToDoctor(Long doctorId, Long patientId) throws Exception;
}
