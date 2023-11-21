package com.rabin.healthsectorproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString(exclude = "patients")
//@Entity
//@Table(name = "doctor_tbl")
//public class Doctor {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "doctor_id")
//    private Long doctorId;
//    @Column(name = "doctor_name" , nullable = false)
//    private String doctorName;
//    @Column(name = "doctor_department" , nullable = false)
//    private String dept;
//    @Column(name = "doctor_epNumber" , nullable = false)
//    private String doctorEPNumber;
//
//    @OneToMany(mappedBy = "doctors", cascade = CascadeType.ALL)
//    private List<Patient> patients;
//}
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "patients")
@Entity
@Table(name = "doctor_tbl")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private Long doctorId;
    @Column(name = "doctor_name" , nullable = false)
    private String doctorName;
    @Column(name = "doctor_department" , nullable = false)
    private String dept;
    @Column(name = "doctor_epNumber" , nullable = false)
    private String doctorEPNumber;

    @OneToMany(mappedBy = "doctors",cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinTable(
            name = "doctor_patient",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "patient_id")
    )
    private List<Patient> patients;
}
