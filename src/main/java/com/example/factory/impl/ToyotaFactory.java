package com.example.factory.impl;

import com.example.factory.CarFactory;
import com.example.factory.detail.carcase.CarCase;
import com.example.factory.detail.carcase.impl.ComfortableCarCase;
import com.example.factory.detail.engine.Engine;
import com.example.factory.detail.engine.impl.ToyotaRavEngine;
import com.example.factory.detail.transmission.Transmission;
import com.example.factory.detail.transmission.impl.MechanicalTransmission;
import org.springframework.stereotype.Component;

@Component
public class ToyotaFactory implements CarFactory {
    public CarCase getCarCase() {
        return new ComfortableCarCase();
    }

    public Engine getEngine() {
        return new ToyotaRavEngine();
    }

    public Transmission getTransmission() {
        return new MechanicalTransmission();
    }
}
