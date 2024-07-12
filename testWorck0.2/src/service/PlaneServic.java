package service;

import model.Plane;

public class PlaneServic {


    //task1
    public void printOnePlane(Plane p1) {
        p1.printInfo();
    }

    //task2
    public void ifMilitaryOrNot(Plane p1) {
        if (p1.isMilitary()) {
            System.out.println(" cost : " + p1.getCost() + "  topSpeed : " + p1.getTopSpeed());
        } else {
            System.out.println("model : " + p1.getModel() + "  country : " + p1.getCountry());
        }
    }

    // task3
    public Plane getnewPlane(Plane p1, Plane p2) {
        if (p1.getYear() < p2.getYear()) {
            return p2;
        }
        return p1;
    }

    // task 4
    public String getBigWingspan(Plane p1, Plane p2) {
        if (p1.getWingspan() > p2.getWingspan()) {
            return p1.getModel();
        }
        return p2.getModel();
    }

    // task 5
    public void getSmallSets(Plane p1, Plane p2, Plane p3) {
        if (p2.getSeats() < p1.getSeats() && p2.getSeats() < p3.getSeats()) {
            System.out.println(p2.getCountry());
        } else if (p3.getSeats() < p1.getSeats() && p3.getSeats() < p2.getSeats()) {
            System.out.println(p3.getCountry());
        } else {
            System.out.println(p3.getCountry());
        }
    }

    // task 6
    public void printNotMilitary(Plane[] planes) {
        for (Plane p : planes) {
            if (!p.isMilitary()) {
                p.printInfo();
                System.out.println();
            }
        }
    }

    // task 7
    public void printMilitaryMoreHours(Plane[] planes) {
        for (Plane p : planes) {
            if (p.isMilitary() && p.getHours() > 100) {
                p.printInfo();
                System.out.println();
            }
        }
    }

    // task 8
    public Plane getMinWeightPlane(Plane[] planes) {
        Plane minP = planes[0];
        for (Plane p : planes) {
            if (p.getWeight() < minP.getWeight()) {
                minP = p;
            }
        }
        return minP;
    }

    // task 9
    public Plane getMinCostMilitaryPlane(Plane[] planes) {
        Plane minCost = null;
        for (Plane p : planes) {
            if (minCost == null && p.isMilitary()) {
                minCost = p;
            } else if (p.isMilitary() && p.getCost() < minCost.getCost()) {
                minCost = p;
            }
        }
        return minCost;
    }

    // task 10
    public void printPlanesOrderByYear(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            for (int j = i + 1; j < planes.length; j++) {
                if (planes[i].getYear() < planes[j].getYear()) {
                  Plane  min = planes[i];
                  planes[i] = planes[j];
                  planes[j] = min;
                }
            }
        }
        for (Plane p : planes) {
            p.printInfo();
            System.out.println("*************************************");
        }

    }
}
