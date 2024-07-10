package model;

public class Car {
    private String model;
    private String color;
    private String manufacturer;

    public Car(String model, String color, String manufacturer) {
        this.model = model;
        this.color = color;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "" + model + " " + color + " " + manufacturer;
    }
}
