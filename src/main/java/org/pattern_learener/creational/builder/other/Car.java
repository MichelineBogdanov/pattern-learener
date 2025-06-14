package org.pattern_learener.creational.builder.other;

import java.awt.*;

public class Car {

    private Model model;
    private int year;
    private int power;
    private Color color;

    public Car() {
    }

    public Car(Model model, int year, int power, Color color) {
        this.model = model;
        this.year = year;
        this.power = power;
        this.color = color;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", year=" + year +
                ", power=" + power +
                ", color=" + color +
                '}';
    }
}
