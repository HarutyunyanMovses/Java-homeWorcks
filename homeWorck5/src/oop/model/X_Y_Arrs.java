package oop.model;

import java.util.Scanner;

public class X_Y_Arrs {
    private int[] x = {12, 6, -7, 8, -12, 0};
    private int[] y = {21, 6, -11, 35, 0, -4};
    private int start = 1;

    Scanner input = new Scanner(System.in);

    private void setStart(int start) {
        this.start = start;
    }

    public void printArr() {
        //**************************************
        System.out.print(" Arr x : ");
        for (int el : this.x) System.out.print(" " + el);
        System.out.println();
        System.out.print(" Arr y : ");
        for (int el : this.y) System.out.print(" " + el);
        //***************************************
        System.out.println();
    }

    private void runAllTasks (){
        printArr();
        task261();
        task263();
        task264();
        task266();
        task267();
        task269();
        setStart(0);
    }

    public void startTask() {
        System.out.println("for run all tasks enter '1' or enter number of task");
        switch (input.nextInt()) {
            case 1 :{
                runAllTasks();
                System.out.println();
                break;
            }
            case 261: {
                task261();
                System.out.println();
                break;
            }
            case 263: {
                task263();
                System.out.println();
                break;
            }
            case 264: {
                task264();
                System.out.println();
                break;
            }
            case 266: {
                task266();
                System.out.println();
                break;
            }
            case 267: {
                task267();
                System.out.println();
                break;
            }
            case 269: {
                task269();
                System.out.println();
                break;
            }
            case 0 :{
                setStart(0);
                System.out.println();
                break;
            }
            default:
                System.out.println("not found this task");
                System.out.println();
        };
        System.out.println("Enter 0 for end program");
      if (this.start == 1)  startTask();
    }

    private void task261() {
        double sum1 = 0;
        double sum2 = 0;
        for (int el : this.x) sum1+=el;
        for (int el : this.y) sum2+=el;
        double res = sum1 / x.length * sum2 / y.length;
        System.out.println("x-i mijin tvabanakan = " + sum1 + " /  " + x.length  + " = " + sum1 / x.length );
        System.out.println("y-i mijin tvabanakan = " + sum2 + " /  " + y.length  + " = " + sum2 / y.length );
        System.out.println("Task 261 : x-i ev y-i tareri mijin tvapanakani artadryal = " + res);
    };
    //*******************************
    private void task263() {
        int count = 0;
        for (int el : this.x) if ( el >= 0) count++;
        for (int el : this.y) if ( el >= 0) count++;
        System.out.println("Task 263: x ev y zangvacneri drakan tareri qanak = " + count);
    };
    //*******************************
    private void task264() {
        int count = 0;
        for (int el : this.x) if ( el < 0) count++;
        for (int el : this.y) if ( el < 0) count++;
        System.out.println("Task 264: x ev y zangvacneri bacasakan tareri qanak = " + count);
    };
    //*******************************
    private void task266() {
        int sum1 = 0;
        int sum2 = 0;
        for (int el : this.x)  if (el % 2 != 0) sum1 += el;
        for (int el : this.y) if ( el % 2 == 0) sum2 += el;
        int res = sum1 - sum2;
        System.out.println("Task 266: x-i kenterui  ev y-i zuygeri tarberutyun = " + sum1 + " + "+ sum2 + " = " + res);
    };
    //*******************************
    private void task267() {
        int sum1 = 0;
        int sum2 = 0;
        for (int el : this.x)  if (el % 7 == 0) sum1 += el;
        for (int el : this.y) if ( el % 7 == 0) sum2 += el;
        int res = sum1 + sum2;
        System.out.println("Task 267: x-i ev y-i  7 i bazmapatik tareri  gumar = " + sum1 + " + "+ sum2 + " = " + res);
    };
    //*******************************
    private void task269() {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < this.x.length; i++) {
            if (i % 2 != 0) sum1 += this.x[i];
        }
        for (int i = 0; i < this.y.length; i++) {
            if (i % 2 == 0) sum2 += this.y[i];
        }
        int res = sum1 + sum2;
        System.out.println("Task 269: x-i zuyg hamari  ev y-i  kent hmarov  tareri  gumar = " + sum1 + " + "+ sum2 + " = " + res);
    };
    //*******************************
}
