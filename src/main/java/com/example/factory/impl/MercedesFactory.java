package com.example.factory.impl;

import com.example.factory.CarFactory;
import com.example.factory.detail.carcase.CarCase;
import com.example.factory.detail.carcase.impl.SportCarCase;
import com.example.factory.detail.engine.Engine;
import com.example.factory.detail.engine.impl.MercedesAMGEngine;
import com.example.factory.detail.transmission.Transmission;
import com.example.factory.detail.transmission.impl.AutoTransmission;
import org.springframework.stereotype.Component;

@Component
public class MercedesFactory implements CarFactory {
    public CarCase getCarCase() {
        return new SportCarCase();
    }

    public Engine getEngine() {
        return new MercedesAMGEngine();
    }

    public Transmission getTransmission() {
        return new AutoTransmission();
    }
}
