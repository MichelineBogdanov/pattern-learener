package org.pattern_learener.creational.builder.other;

import java.awt.*;

public class TestOtherBuilder {

    public static void main(String[] args) {
        Car car1 = Car.builder()
                .model(Model.BMW)
                .year(2020)
                .power(200)
                .color(Color.BLACK)
                .getCar();
        System.out.println(car1);

        Car car2 = Car.builder()
                .model(Model.LADA)
                .year(2015)
                .power(80)
                .getCar();
        System.out.println(car2);

        Car car3 = Car.builder()
                .model(Model.CHERRY)
                .color(Color.BLACK)
                .getCar();
        System.out.println(car3);
    }

}
