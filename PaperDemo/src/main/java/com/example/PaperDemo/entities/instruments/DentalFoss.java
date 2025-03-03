package com.example.PaperDemo.entities.instruments;

import com.example.PaperDemo.interfaces.HealingInstrument;
import org.springframework.stereotype.Component;

@Component
public class DentalFoss implements HealingInstrument {
    @Override
    public void use() {
        System.out.println("Dental Foss");
    }
}
