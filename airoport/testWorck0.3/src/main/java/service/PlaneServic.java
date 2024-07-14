package service;

import model.Plane;

public class PlaneServic {


    //task1
    public void printOnePlane(Plane p1) {
        p1.printInfo();
    }

    //task2
    public String ifMilitaryOrNot(Plane p1) {
        String res = "";
        if (p1.isMilitary()) {
            res = " cost : " + p1.getCost() + "  topSpeed : " + p1.getTopSpeed();
        } else {
            res = "model : " + p1.getModel() + "  country : " + p1.getCountry();
        }
        return res;
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
    public String getSmallSets(Plane p1, Plane p2, Plane p3) {
        String result = "";
        if (p2.getSeats() < p1.getSeats() && p2.getSeats() < p3.getSeats()) {
            result = p2.getCountry();
        } else if (p3.getSeats() < p1.getSeats() && p3.getSeats() < p2.getSeats()) {
            result = p3.getCountry();
        } else {
            result = p1.getCountry();
        }
        return result;
    }

    // task 6
    public Plane[] getNotMilitary(Plane[] planes) {
        int count = 0;
        for (Plane p : planes) {
            if (!p.isMilitary()) {
                count++;
            }
        }
        Plane[] res = new Plane[count];
        for (Plane p : planes) {
            if (!p.isMilitary()) {
                res[res.length - count] = p;
                count--;
            }
        }
        return res;
    }

    // task 7
    public Plane[] getMilitaryMoreHours(Plane[] planes) {
        int count = 0;
        for (Plane p : planes) {
            if (p.isMilitary() && p.getHours() > 100) {
                count++;
            }
        }
        Plane[] res = new Plane[count];
        for (Plane p : planes) {
            if (p.isMilitary() && p.getHours() > 100) {
                res[res.length - count] = p;
                count--;
            }
        }
        return res;
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
    public Plane[] getPlanesOrderByYear(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            for (int j = i + 1; j < planes.length; j++) {
                if (planes[i].getYear() < planes[j].getYear()) {
                    Plane min = planes[i];
                    planes[i] = planes[j];
                    planes[j] = min;
                }
            }
        }
        return planes;
    }

    public Plane[] getPlanes() {
        Plane p1 = new Plane("ed1r32e", "use", 2001, 1541.5, false, 50540.25,
                12.5, 1400, 450, 800565.4);
        Plane p2 = new Plane("ed1kl2e", "italy", 1990, 44.5, true, 57540.25,
                14.5, 1100, 257, 804565.4);
        Plane p3 = new Plane("kl56j2e", "italy", 1990, 4451.5, true, 57540.25,
                14.5, 1100, 257, 804565.4);
        Plane p4 = new Plane("eh6d12e", "franc", 2022, 751.5, false, 60540.25,
                16, 1200, 161, 74015.4);
        Plane p5 = new Plane("ed1po92e", "russia", 2021, 151.5, false, 70570.25,
                15.4, 2100, 500, 165.4);
        Plane p6 = new Plane("ed1preto92e", "russia", 2019, 151.5, true, 70570.25,
                15.4, 2100, 500, 6565.4);
        return new Plane[]{p1, p2, p3, p4, p5, p6};
    }
}
