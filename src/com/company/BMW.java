package com.company;

public class BMW extends Car{

    private String model;

    public BMW(int speed, int volumeOfEngine, String model) {
        super(speed, volumeOfEngine);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void print() {
        System.out.println(getInfo() + "\nModel: " + model);

    }
}
