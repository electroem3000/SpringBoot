package com.example.PaperDemo.entities.instruments;

import com.example.PaperDemo.interfaces.HealingInstrument;
import org.springframework.stereotype.Component;

@Component
public class ToothPaste implements HealingInstrument {
    @Override
    public void use() {
        System.out.println("Tooth Paste");
    }
}
