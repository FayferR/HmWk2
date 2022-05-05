package com.company;

public class Main {

    public static void main(String[] args) {
        Printable print[] = {createObject("oneObject"), createObject("twoObject"),
                createObject("threeObject")};
        for (Printable printable : print) {
            printable.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "oneObject":
                Audi audi = new Audi(320, 5, "R8");
                return audi;

            case "twoObject":
                BMW bmw = new BMW(300, 6, "X7");
                return bmw;

            case "threeObject":
                Mercedes mercedes = new Mercedes(280, 4, "AMG");
                return mercedes;
        }
        return null;
    }
}
