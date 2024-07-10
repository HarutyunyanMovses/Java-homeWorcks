package model;

public class RacingCar extends Car {
    private int maxSpeed ;
    private double enginVolume;

    public RacingCar(String model, String color, String manufacturer, int maxSpeed, double enginVolume) {
        super(model, color, manufacturer);
        this.maxSpeed = maxSpeed;
        this.enginVolume = enginVolume;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getEnginVolume() {
        return enginVolume;
    }

    public void setEnginVolume(double enginVolume) {
        enginVolume = enginVolume;
    }

    @Override
    public String toString() {
        return super.toString() + " " + maxSpeed + "km/h " + enginVolume+"L ";
    }
}
