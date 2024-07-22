package services;

import model.Plane;

public interface AiroportIMPL {
    // task 1
    public static void printInfo(Plane p1) {
    }

    // task 2
    public static void ifMilitaryOrNot(Plane p1){};

    // task 3
    public Plane getnewPlane(Plane p1, Plane p2);

    // task 4
    public String getBigWingspan(Plane p1, Plane p2);

    // task 5
    public void getSmallSets(Plane p1, Plane p2, Plane p3);

    // task 6
    public void printNotMilitary(Plane[] planes);

    // task 7
    public void printMilitaryMoreHours(Plane[] planes);

    // task 8
    public Plane getMinWeightPlane(Plane[] planes);

    // task 9
    public Plane getMinCostMilitaryPlane(Plane[] planes);

    // task 10
    public void printPlanesOrderByYear(Plane[] planes);


}
