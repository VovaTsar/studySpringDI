package com.example.factory.detail.carcase.impl;

import com.example.factory.detail.carcase.CarCase;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SportCarCase implements CarCase {
    public void addCarCase() {
        System.out.println("Add SportCarCase to car.");
    }
}
