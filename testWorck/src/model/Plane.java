package model;

public class Plane {
    private String model ;
    private String country;
    private int year;
    private double hours;
    boolean military;
    private double weight;
    private double wingspan;
    private double topSpeed ;
    private int seats;
    private double cost;

    public Plane(String model, String country, int year, double hours,boolean military, double weight, double wingspan, double topSpeed, int seats, double cost) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.military = military;
        this.weight = weight;
        this.wingspan = wingspan;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.cost = cost;
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

    public void setYear(int year) {
        this.year = year;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public void printInfo(){
        System.out.println("model : " + model);
        System.out.println("country : " + country);
        System.out.println("year : " + year);
        System.out.println("hours : " + hours);
        System.out.println("military : " + military);
        System.out.println("weight : " + weight);
        System.out.println("wingspan : " + wingspan);
        System.out.println("topSpeed : " + topSpeed);
        System.out.println("seats : " + seats);
        System.out.println("cost : " + cost);
    }
}
