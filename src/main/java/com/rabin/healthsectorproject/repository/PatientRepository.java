package com.rabin.healthsectorproject.repository;

import com.rabin.healthsectorproject.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
    Optional<Patient> findByHealthInsurancePolicyNumber(String healthInsurancePolicyNumber);
}
