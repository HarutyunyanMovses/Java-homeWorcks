package model;

public class PassengersCar extends Car {
    private int maxPassCount ;
    private String fuelType ;

    public PassengersCar(String model, String color, String manufacturer, int maxPassCount, String fuelType) {
        super(model, color, manufacturer);
        this.maxPassCount = maxPassCount;
        this.fuelType = fuelType;
    }

    public int getMaxPassCount() {
        return maxPassCount;
    }

    public void setMaxPassCount(int maxPassCount) {
        this.maxPassCount = maxPassCount;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + " " + maxPassCount + " " + fuelType;
    }
}
