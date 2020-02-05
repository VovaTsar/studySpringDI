package com.example.car.impl;

import com.example.car.Car;
import com.example.factory.CarFactory;
import com.example.factory.detail.carcase.CarCase;
import com.example.factory.detail.engine.Engine;
import com.example.factory.detail.transmission.Transmission;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Toyota implements Car {
    private CarCase carCase;
    private Engine engine;
    private Transmission transmission;

    public Toyota(@Qualifier("toyotaFactory") CarFactory carFactory) {
        this.carCase = carFactory.getCarCase();
        this.engine = carFactory.getEngine();
        this.transmission = carFactory.getTransmission();
    }

    public void showTransmissionInfo() {
        transmission.addTransmission();
    }

    public void showCarCaseInfo() {
        carCase.addCarCase();
    }

    public void showEngineInfo() {
        engine.addEngine();
    }
}
