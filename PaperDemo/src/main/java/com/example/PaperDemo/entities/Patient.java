package com.example.PaperDemo.entities;

import com.example.PaperDemo.enums.HealingType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Patient {
    String name;
    Integer age;
    HealingType healingType;
}
