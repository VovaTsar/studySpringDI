package com.example.util;

import com.example.car.Car;
import com.example.car.impl.Mercedes;
import com.example.car.impl.Toyota;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public final class ShowCarUtil {
    public static List<Car> createCar(AnnotationConfigApplicationContext context) {
        Car mercedes = context.getBean("mercedes", Mercedes.class);
        Car toyota = context.getBean("toyota", Toyota.class);


        List<Car> cars = new ArrayList<>();
        cars.add(mercedes);
        cars.add(toyota);
        return cars;
    }

    public static void printCar(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
            car.showCarCaseInfo();
            car.showEngineInfo();
            car.showTransmissionInfo();
            System.out.println(" ");
        }
    }
}
