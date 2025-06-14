package org.pattern_learener.creational.builder.other;

import java.awt.*;

public class CarBuilder {

    private final Car car = new Car();

    public CarBuilder model(Model model) {
        car.setModel(model);
        return this;
    }

    public CarBuilder year(int year) {
        car.setYear(year);
        return this;
    }

    public CarBuilder power(int power) {
        car.setPower(power);
        return this;
    }

    public CarBuilder color(Color color) {
        car.setColor(color);
        return this;
    }

    public Car getCar() {
        return car;
    }

}
