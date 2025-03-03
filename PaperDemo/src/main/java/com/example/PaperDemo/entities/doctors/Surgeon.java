package com.example.PaperDemo.entities.doctors;

import com.example.PaperDemo.annotations.InjectList;
import com.example.PaperDemo.entities.Patient;
import com.example.PaperDemo.entities.instruments.Needle;
import com.example.PaperDemo.entities.instruments.Scalpel;
import com.example.PaperDemo.enums.HealingType;
import com.example.PaperDemo.interfaces.Doctor;
import com.example.PaperDemo.interfaces.HealingInstrument;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Surgeon implements Doctor {
    @InjectList({Needle.class, Scalpel.class})
    List<HealingInstrument> instruments;

    @Override
    public void heal(Patient patient) {
        System.out.println("Surgeon is healing body");
        instruments.forEach(HealingInstrument::use);
    }

    @Override
    public HealingType getHealingType() {
        return HealingType.BODY;
    }
}
