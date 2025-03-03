package com.example.PaperDemo.entities.doctors;

import com.example.PaperDemo.annotations.InjectList;
import com.example.PaperDemo.entities.Patient;
import com.example.PaperDemo.entities.instruments.ConversationalTherapy;
import com.example.PaperDemo.enums.HealingType;
import com.example.PaperDemo.interfaces.Doctor;
import com.example.PaperDemo.interfaces.HealingInstrument;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Psychiatrist implements Doctor {
    @InjectList({ConversationalTherapy.class})
    List<HealingInstrument> instruments;

    @Override
    public void heal(Patient patient) {
        System.out.println("Psychiatrist is healing soul");
        instruments.forEach(HealingInstrument::use);
    }

    @Override
    public HealingType getHealingType() {
        return HealingType.SOUL;
    }
}
