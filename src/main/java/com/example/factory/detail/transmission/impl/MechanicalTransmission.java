package com.example.factory.detail.transmission.impl;

import com.example.factory.detail.transmission.Transmission;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MechanicalTransmission implements Transmission {
    public void addTransmission() {
        System.out.println("Add MechanicalTransmission to car.");
    }
}
