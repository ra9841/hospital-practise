package com.rabin.healthsectorproject.service;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.rabin.healthsectorproject.dto.DoctorDto;
import com.rabin.healthsectorproject.dto.PatientDto;
import com.rabin.healthsectorproject.entity.Doctor;
import com.rabin.healthsectorproject.entity.Patient;
import com.rabin.healthsectorproject.exception.RecordAlreadyPresentException;
import com.rabin.healthsectorproject.repository.DoctorRepository;
import com.rabin.healthsectorproject.repository.PatientRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private PatientRepository patientRepository;

//    @Override
//    public DoctorDto savingDoctorRecord(DoctorDto doctorDto) {
//        Optional<Doctor> existDoctor = doctorRepository.findByDoctorEPNumber(doctorDto.getDoctorEPNumber());
//        if (existDoctor.isPresent()) {
//            log.error("Record is already present in database {}", existDoctor);
//            throw new RecordAlreadyPresentException("Doctor having same EPNumber record is already present.So no need to register.Thank you");
//        }
//        Doctor doctor = new Doctor();
//        doctor.setDoctorName(doctorDto.getDoctorName());
//        doctor.setDoctorEPNumber(doctorDto.getDoctorEPNumber());
//        doctor.setDept(doctorDto.getDept());
//
//        List<Patient>patientList=new ArrayList<>();
//
//        List<PatientDto> patientDtoList=doctorDto.getPatients();
//       for(PatientDto patientDto:patientDtoList){
//           Patient patient=new Patient();
//           patient.setFirstName(patientDto.getFirstName());
//           patient.setLastName(patientDto.getLastName());
//           patient.setAddress(patientDto.getAddress());
//           patient.setGender(patientDto.getGender());
//           patient.setAge(patientDto.getAge());
//           patient.setDisease(patientDto.getDisease());
//           patient.setEmail(patientDto.getEmail());
//           patient.setPassword(patientDto.getPassword());
//           patient.setHealthInsuranceName(patientDto.getHealthInsuranceName());
//           patient.setHealthInsurancePolicyNumber(patientDto.getHealthInsurancePolicyNumber());
//           patient.setDoctors(doctor);
//           patientList.add(patient);
//       }
//       doctor.setPatients(patientList);
//
//        log.info("doctor record is saved in database {}", doctor);
//        Doctor doctor1 = doctorRepository.save(doctor);
//        DoctorDto doctorDto1 = new DoctorDto();
//        BeanUtils.copyProperties(doctor1, doctorDto1);
//        log.info("doctor record is passing to controller {}", doctorDto1);
//        return doctorDto1;
//    }

    @Override
    public DoctorDto savingDoctorRecord(DoctorDto doctorDto) {
        Optional<Doctor> existDoctor = doctorRepository.findByDoctorEPNumber(doctorDto.getDoctorEPNumber());
        if (existDoctor.isPresent()) {
            log.error("Record is already present in database {}", existDoctor);
           throw new RecordAlreadyPresentException("Doctor having same EPNumber record is already present.So no need to register.Thank you");
       }
        Doctor doctor=new Doctor();
        BeanUtils.copyProperties(doctorDto,doctor);
        Doctor doctor1=doctorRepository.save(doctor);
        DoctorDto doctorDto1=new DoctorDto();
        BeanUtils.copyProperties(doctor1,doctorDto1);
        return doctorDto1;
    }

    @Override
    public DoctorDto assigningPatientToDoctor(Long doctorId, Long patientId) throws Exception {
        List<Patient>patientList=null;
        Optional<Doctor> existDoctor=doctorRepository.findByDoctorId(doctorId);
        Optional<Patient> existPatient=patientRepository.findByPatientId(patientId);

        if(existDoctor.isPresent() && existPatient.isPresent()){
           Doctor doctor= existDoctor.get();
            Patient patient=existPatient.get();

            patientList=doctor.getPatients();
            patientList.add(patient);

            doctor.setPatients(patientList);
            doctorRepository.save(doctor);

            DoctorDto doctorDto=new DoctorDto();
            BeanUtils.copyProperties(doctor,doctorDto);
            return doctorDto;
        }
        throw new Exception("not found");
    }


}
