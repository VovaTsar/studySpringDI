package com.example.factory;

import com.example.factory.detail.carcase.CarCase;
import com.example.factory.detail.engine.Engine;
import com.example.factory.detail.transmission.Transmission;

public interface CarFactory {
    CarCase getCarCase();

    Engine getEngine();

    Transmission getTransmission();
}
