package com.example.PaperDemo.services;

import com.example.PaperDemo.entities.doctors.Nurse;
import com.example.PaperDemo.entities.Patient;
import com.example.PaperDemo.enums.HealingType;
import com.example.PaperDemo.interfaces.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class HospitalService {
    Map<HealingType, Doctor> doctors;

    HospitalService(List<Doctor> doctorsList) {
        doctors = doctorsList.stream().collect(Collectors.toMap(Doctor::getHealingType, doctor -> doctor));
    }

    public void processPatient(Patient patient) {
        doctors.getOrDefault(patient.getHealingType(), new Nurse()).heal(patient);
    }

}
