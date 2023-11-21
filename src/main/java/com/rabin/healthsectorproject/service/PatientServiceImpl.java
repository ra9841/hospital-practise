package com.rabin.healthsectorproject.service;

import com.rabin.healthsectorproject.dto.PatientDto;
import com.rabin.healthsectorproject.entity.Patient;
import com.rabin.healthsectorproject.exception.RecordAlreadyPresentException;
import com.rabin.healthsectorproject.repository.PatientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public PatientDto savingTheRecordOfPatient(PatientDto patientDto) {
        Optional<Patient> existPatient = patientRepository.findByHealthInsurancePolicyNumber(patientDto.getHealthInsurancePolicyNumber());
        if (existPatient.isPresent()) {
            log.error("Patient record is present in database {}", existPatient);
            throw new RecordAlreadyPresentException("Patient having same policy number is already register.So no need to register again.Thank you");
        }
        Patient patient = new Patient();
        BeanUtils.copyProperties(patientDto, patient);
        log.info("Patient record save in database {}", patient);
        Patient patient1 = patientRepository.save(patient);
        PatientDto patientDto1 = new PatientDto();
        BeanUtils.copyProperties(patient1, patientDto1);
        log.info("Patient record pass from database to controller {}", patientDto1);
        return patientDto1;
    }
}
