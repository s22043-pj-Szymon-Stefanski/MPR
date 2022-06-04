package com.example.demo;

public class Car {
    String brand;
    String model;
    String gears;

    public Car() {

    }

    public Car(String brand, String model, String gears) {
        this.brand = brand;
        this.model = model;
        this.gears = gears;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setGears(String gears) {
        this.gears = gears;
    }

    public String getModel() {
        return model;
    }

    public String getGears() {
        return gears;
    }
}
