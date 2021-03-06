package com.composition;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Celling celling = new Celling(12,33);

        Bed bed = new Bed("Modern",4,3,2,1);

        Lamp lamp = new Lamp("Classic",false,75);

        Bedroom bedroom = new Bedroom("Akbar",wall1,wall2,wall3,wall4,celling,bed,lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();
    }
}
