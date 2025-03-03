package com.example.PaperDemo.entities.doctors;

import com.example.PaperDemo.entities.Patient;
import com.example.PaperDemo.enums.HealingType;
import com.example.PaperDemo.interfaces.Doctor;
import com.example.PaperDemo.interfaces.HealingInstrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Nurse implements Doctor {
    @Autowired
    List<HealingInstrument> instruments;

    @Override
    public void heal(Patient patient) {
        System.out.println("Nurse is healing all patient");
        instruments.forEach(HealingInstrument::use);
    }

    @Override
    public HealingType getHealingType() {
        return HealingType.ALL;
    }
}
