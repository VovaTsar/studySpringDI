package com.example.factory.detail.carcase.impl;

import com.example.factory.detail.carcase.CarCase;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ComfortableCarCase implements CarCase{
    public void addCarCase() {
        System.out.println("Add ComfortableCarCase to car.");
    }
}
