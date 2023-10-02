package com.artemdev.mocks_exceptions;

public class Car {
    private final String brand;
    private final Engine engine;

    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public int getMaxSpeed() {
        return engine.getPower() + 100;
    }

    public String getCopyrightTitle() {
        return brand + " @";
    }
}
