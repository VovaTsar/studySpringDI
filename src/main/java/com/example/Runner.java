package com.example;

import com.example.car.Car;
import com.example.util.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static com.example.util.ShowCarUtil.createCar;
import static com.example.util.ShowCarUtil.printCar;


public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(Configuration.class);
        List<Car> cars = createCar(context);

        printCar(cars);

        context.close();
    }


}
