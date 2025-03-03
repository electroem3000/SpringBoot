package com.example.PaperDemo.controllers;

import com.example.PaperDemo.entities.Patient;
import com.example.PaperDemo.services.HospitalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hospital")
public class HospitalController {
    private final HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @PostMapping("/heal")
    public Patient hospital(@RequestBody Patient patient) {
        hospitalService.processPatient(patient);
        return patient;
    }

}
