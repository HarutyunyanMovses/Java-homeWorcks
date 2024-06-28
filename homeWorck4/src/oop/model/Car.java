package oop.model;

public class Car {
    public String model;  // ""
    public int year = 1953;   // 0
    public String color; // ""
    public Boolean crashed = false; //
    public double maxSpeed;  //0

    public void printFileds() {
        System.out.println("model : " + model);
        System.out.println("year : " + year);
        System.out.println("color : " + color);
        System.out.println("crashed_or_not : " +crashed);
        System.out.println("maxSpeed : " + maxSpeed);
    }

}
