package com.example.PaperDemo.interfaces;

import com.example.PaperDemo.entities.Patient;
import com.example.PaperDemo.enums.HealingType;

public interface Doctor {
    void heal(Patient patient);

    HealingType getHealingType();
}
