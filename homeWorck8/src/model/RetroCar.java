package model;

public class RetroCar extends Car{
    private int year;
    private double price;

    public RetroCar(String model, String color, String manufacturer, int year, double price) {
        super(model, color, manufacturer);
        this.year = year;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + " " + year + " " + price+"$";
    }
}
