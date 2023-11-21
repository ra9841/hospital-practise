package com.rabin.healthsectorproject.repository;

import com.rabin.healthsectorproject.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {
    Optional<Doctor> findByDoctorEPNumber(String doctorEPNumber);
}
