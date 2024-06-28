package oop;
import oop.model.Car;

public class Main {
    public static void main(String[] args) {

        Car n1 = new Car();
        n1.year = 2021;
        n1.model = "Tesla";
        n1.color = "Black";
        n1.maxSpeed = 250;

        n1.printFileds();
    }
}