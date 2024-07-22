package services;

import model.Plane;


public class AiroportService {

    public static Plane[] createPlanes(String[] planesList) throws Exception {
        Plane[] planes = new Plane[planesList.length];
        for (int i = 0; i < planesList.length; i++) {
            Plane p = new Plane(planesList[i].split(", "));
            planes[i] = p;
            FileService.CreateFileObj(p);
        }
        return planes;
    }

    //task1
    public static void printInfo(Plane p1) {
        System.out.println("model : " + p1.getModel());
        System.out.println("country : " + p1.getCountry());
        System.out.println("year : " + p1.getYear());
        System.out.println("hours : " + p1.getHours());
        System.out.println("military : " + p1.isMilitary());
        System.out.println("weight : " + p1.getWeight() + "KG");
        System.out.println("wingspan : " + p1.getWingspan() + "m");
        System.out.println("topSpeed : " + p1.getTopSpeed() + "km/h");
        System.out.println("seats : " + p1.getSeats());
        System.out.println("cost : " + p1.getCost() + "$");
    }

    //task2
    public static void ifMilitaryOrNot(Plane p1) {
        if (p1.isMilitary()) {
            System.out.println(" cost : " + p1.getCost() + "  topSpeed : " + p1.getTopSpeed());
        } else {
            System.out.println("model : " + p1.getModel() + "  country : " + p1.getCountry());
        }
    }

    // task3
    public static Plane getnewPlane(Plane p1, Plane p2) throws Exception {
        if (p1.getYear() < p2.getYear()) {
            String s = "\nThe newest " + p2.getModel() + " and " + p1.getModel() + " is " + p2.getModel() + "  : Task 3";
            FileService.writeIN(p2.getModel(), s);
            return p2;
        }
        String s = "\nThe newest " + p1.getModel() + " and " + p2.getModel() + " is " + p1.getModel() + "  : Task 3";
        FileService.writeIN(p1.getModel(), s);
        return p1;
    }

    // task 4
    public static String getBigWingspan(Plane p1, Plane p2) throws Exception {
        if (p1.getWingspan() > p2.getWingspan()) {
            String s = "\nThe big wingspan  " + p1.getModel() + " and " + p2.getModel() + " have " + p1.getModel() + "  : Task 4";
            FileService.writeIN(p1.getModel(), s);
            return p1.getModel();
        }
        String s = "\nThe big wingspan  " + p2.getModel() + " and " + p1.getModel() + " have " + p2.getModel() + "  : Task 4";
        FileService.writeIN(p2.getModel(), s);
        return p2.getModel();
    }

    // task 5
    public static void getSmallSets(Plane p1, Plane p2, Plane p3) throws Exception {
        if (p2.getSeats() < p1.getSeats() && p2.getSeats() < p3.getSeats()) {
            String s = "\nHave small sets " + p2.getModel() + ", "
                    + p1.getModel() + ", " + p2.getModel() + " is " + p2.getModel() + "  : Task 5";
            FileService.writeIN(p2.getModel(), s);
            System.out.println(p2.getCountry());
        } else if (p3.getSeats() < p1.getSeats() && p3.getSeats() < p2.getSeats()) {
            String s = "\nHave small sets " + p2.getModel() + ", "
                    + p1.getModel() + ", " + p2.getModel() + " is " + p3.getModel() + "  : Task 5";
            FileService.writeIN(p3.getModel(), s);
            System.out.println(p3.getCountry());
        } else {
            String s = "\nHave small sets " + p2.getModel() + ", "
                    + p1.getModel() + ", " + p2.getModel() + " is " + p1.getModel() + "  : Task 5";
            FileService.writeIN(p1.getModel(), s);
            System.out.println(p1.getCountry());
        }
    }

    // task 6
    public static void printNotMilitary(Plane[] planes) {
        for (Plane p : planes) {
            if (!p.isMilitary()) {
                printInfo(p);
                System.out.println();
            }
        }
    }

    // task 7
    public static void printMilitaryMoreHours(Plane[] planes) {
        for (Plane p : planes) {
            if (p.isMilitary() && p.getHours() > 100) {
                printInfo(p);
                System.out.println();
            }
        }
    }

    // task 8
    public static Plane getMinWeightPlane(Plane[] planes) throws Exception {
        Plane minP = planes[0];
        for (Plane p : planes) {
            if (p.getWeight() < minP.getWeight()) {
                minP = p;
            }
        }
        String s = "The plane whit minimal weight is " + minP.getModel() + "  : Task 8";
        FileService.writeIN(minP.getModel(), s);
        return minP;
    }

    // task 9
    public static Plane getMinCostMilitaryPlane(Plane[] planes) throws Exception {
        Plane minCost = null;
        for (Plane p : planes) {
            if (minCost == null && p.isMilitary()) {
                minCost = p;
            } else if (p.isMilitary() && p.getCost() < minCost.getCost()) {
                minCost = p;
            }
        }
        String s = "The plane whit minimal cost from all military planes is " + minCost.getModel() + "  : Task 9";
        FileService.writeIN(minCost.getModel(), s);
        return minCost;
    }

    // task 10
    public static void printPlanesOrderByYear(Plane[] planes) throws Exception {
        for (int i = 0; i < planes.length; i++) {
            for (int j = i + 1; j < planes.length; j++) {
                if (planes[i].getYear() < planes[j].getYear()) {
                    Plane min = planes[i];
                    planes[i] = planes[j];
                    planes[j] = min;
                }
            }
        }
        FileService.newFile("sort_list");
        for (Plane p : planes) {
            FileService.writeIN("sort_list" , p.toString()+'\n');
            printInfo(p);
            System.out.println("*************************************");
        }

    }
}
