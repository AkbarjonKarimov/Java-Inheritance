package com.company;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,10);
        Case theCase = new Case("220B","Dell","250",dimensions);
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,new Resolution(2540,1440));
        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,5,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);
        thePC.getMonitor().drawPixelAt(1,2,"Blue");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();
    }
}
