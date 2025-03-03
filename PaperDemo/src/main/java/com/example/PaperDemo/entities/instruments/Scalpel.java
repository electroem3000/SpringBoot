package com.example.PaperDemo.entities.instruments;

import com.example.PaperDemo.interfaces.HealingInstrument;
import org.springframework.stereotype.Component;

@Component
public class Scalpel implements HealingInstrument {
    @Override
    public void use() {
        System.out.println("Scalpel");
    }
}
