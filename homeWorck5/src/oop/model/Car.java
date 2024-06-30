package oop.model;

import java.util.Scanner;

public class Car {
    private String model;  // ""
    private String color; // ""
    private int year = 1953;   // 0
    private Boolean crashed = false; //
    private double maxSpeed;  //0

    //************************ Geters ********************
    public String getModel() {return model;}
    public String getColor() {return color;}
    public int getYear() {return year;}
    public Boolean getCrashed() {return crashed;}
    public double getMaxSpeed() {return maxSpeed;}
    //************************ Seters **********************

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void isCrashed(Boolean crashed) {
        this.crashed = crashed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    //*********************** other funqtion ***************

    public void completeFiels(){
        System.out.println("Compplete the fields");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the model of car");
        setModel(input.nextLine());
        System.out.println("Enter the color of car");
        setColor(input.nextLine());
        System.out.println("Enter the Year of car");
        setYear(input.nextInt());
        System.out.println("Enter maximum speed of car");
        setMaxSpeed(input.nextDouble());
        System.out.println("Enter the crashed your car or not ");
        isCrashed(input.hasNext());
        System.out.println();
          printFileds();
    }

    public void printFileds() {
        System.out.println("model : " + getModel());
        System.out.println("year : " + getYear());
        System.out.println("color : " + getColor());
        System.out.println("crashed_or_not : " +getCrashed());
        System.out.println("maxSpeed : " + getMaxSpeed());
    }

}
