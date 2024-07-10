package model;

public class TruckCar extends Car {
    private int maxWeight;
    private boolean isColdStorage;

    public TruckCar(String model, String color, String manufacturer, int maxWeight, boolean isColdStorage) {
        super(model, color, manufacturer);
        this.maxWeight = maxWeight;
        this.isColdStorage = isColdStorage;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public boolean isColdStorage() {
        return isColdStorage;
    }

    public void setColdStorage(boolean coldStorage) {
        isColdStorage = coldStorage;
    }

    @Override
    public String toString() {
        return super.toString()+ " " + maxWeight + "kg " + isColdStorage;

    }
}
