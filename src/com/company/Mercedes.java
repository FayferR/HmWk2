package com.company;

public class Mercedes extends Car{

    private String model;

    public Mercedes(int speed, int volumeOfEngine, String model) {
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
