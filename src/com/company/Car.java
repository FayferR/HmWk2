package com.company;

public class Car implements Printable {

    @Override
    public void print() {

    }
    private int speed;
    private int volumeOfEngine;

    public Car(int speed, int volumeOfEngine) {
        this.speed = speed;
        this.volumeOfEngine = volumeOfEngine;
    }

    public int getSpeed() {
        return speed;
    }

    public int getVolumeOfEngine() {
        return volumeOfEngine;
    }



    public String getInfo() {
        return "Speed: " + speed +
                "\nVolume of Engine" + volumeOfEngine;
    }
}

