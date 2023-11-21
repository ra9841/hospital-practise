package com.rabin.healthsectorproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString(exclude = "doctors")
//@Entity
//@Table(name = "patient_tbl")
//public class Patient {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "patient_id")
//    private Long patientId;
//    @Column(name = "patient_firstName", nullable = false)
//    private String firstName;
//    @Column(name = "patient_lastName", nullable = false)
//    private String lastName;
//    @Column(name = "patient_address", nullable = false)
//    private String address;
//    @Column(name = "patient_gender", nullable = false)
//    private String gender;
//    @Column(name = "patient_age", nullable = false)
//    private int age;
//    @Column(name = "patient_disease", nullable = false)
//    private String disease;
//    @Column(name = "patient_email", nullable = false)
//    private String email;
//    @Column(name = "patient_password", nullable = false)
//    private String password;
//    @Column(name = "patient_healthInsurancePolicyNumber")
//    private String healthInsurancePolicyNumber;
//    @Column(name = "patient_healthInsuranceName")
//    private String healthInsuranceName;
//
//    @ManyToOne
//    @JoinColumn(name = "doctor_epNumber")
//    private Doctor doctors;
//
//}

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "doctors")
@Entity
@Table(name = "patient_tbl")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Long patientId;
    @Column(name = "patient_firstName", nullable = false)
    private String firstName;
    @Column(name = "patient_lastName", nullable = false)
    private String lastName;
    @Column(name = "patient_address", nullable = false)
    private String address;
    @Column(name = "patient_gender", nullable = false)
    private String gender;
    @Column(name = "patient_age", nullable = false)
    private int age;
    @Column(name = "patient_disease", nullable = false)
    private String disease;
    @Column(name = "patient_email", nullable = false)
    private String email;
    @Column(name = "patient_password", nullable = false)
    private String password;
    @Column(name = "patient_healthInsurancePolicyNumber")
    private String healthInsurancePolicyNumber;
    @Column(name = "patient_healthInsuranceName")
    private String healthInsuranceName;

   // @ManyToOne
    //@JoinColumn(name = "doctor_id")
    //private Doctor doctors;

}
