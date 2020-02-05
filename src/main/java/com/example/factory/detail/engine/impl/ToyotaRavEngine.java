package com.example.factory.detail.engine.impl;

import com.example.factory.detail.engine.Engine;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ToyotaRavEngine implements Engine {
    public void addEngine() {
        System.out.println("Add Engine to ToyotaRav.");
    }
}
