package com.example.PaperDemo.entities.doctors;

import com.example.PaperDemo.annotations.InjectList;
import com.example.PaperDemo.entities.Patient;
import com.example.PaperDemo.entities.instruments.DentalFoss;
import com.example.PaperDemo.entities.instruments.ToothPaste;
import com.example.PaperDemo.enums.HealingType;
import com.example.PaperDemo.interfaces.Doctor;
import com.example.PaperDemo.interfaces.HealingInstrument;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Dentist implements Doctor {
    @InjectList({DentalFoss.class, ToothPaste.class})
    List<HealingInstrument> instruments;

    @Override
    public void heal(Patient patient) {
        System.out.println("Dentist is healing tooth");
        instruments.forEach(HealingInstrument::use);
    }

    @Override
    public HealingType getHealingType() {
        return HealingType.TOOTH;
    }
}
