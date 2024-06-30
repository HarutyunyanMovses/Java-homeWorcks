package oop;

import oop.model.Car;
import oop.model.X_Y_Arrs;

public class Main {
    public static void main(String[] args) {

        Car n1 = new Car();
        n1.completeFiels();

        System.out.println("***********************************************************");

        X_Y_Arrs tset = new X_Y_Arrs();
        tset.printArr();
        tset.startTask();

    }
}