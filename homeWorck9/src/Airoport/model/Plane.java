package Airoport.model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private double hours;
    boolean military;
    private double weight;
    private double wingspan;
    private double topSpeed;
    private int seats;
    private double cost;

    public Plane(String model, String country, int year, double hours, boolean military, double weight, double wingspan, double topSpeed, int seats, double cost) {
        this.model = model;
        this.country = country;
        this.year = setYear(year);
        setHours(hours);
        this.military = military;
        setWeight(weight);
        setWingspan(wingspan);
        setTopSpeed(topSpeed);
        setSeats(seats);
        setCost(cost);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public int setYear(int year) {
        this.year = year < 1903 ? 1903 : year > 2021 ? 2021 : year;
        return year;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours < 0 ? 0 : hours > 10000 ? 10000 : hours;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight < 0 ? 0 : weight > 10000 ? 10000 : weight;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan < 10 ? 10 : wingspan > 45 ? 45 : wingspan;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed < 0 ? topSpeed * -1 : topSpeed;
        ;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats < 0 ? seats * -1 : seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost < 0 ? cost * -1 : cost;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

}

