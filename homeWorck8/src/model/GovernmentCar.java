package model;

public class GovernmentCar extends  Car{
    private boolean isBron ;
    private String softwareSecurity;

    public GovernmentCar(String model, String color, String manufacturer, boolean isBron, String softwareSecurity) {
        super(model, color, manufacturer);
        this.isBron = isBron;
        this.softwareSecurity = softwareSecurity;
    }

    public boolean isBron() {
        return isBron;
    }

    public void setBron(boolean bron) {
        isBron = bron;
    }

    public String getSoftwareSecurity() {
        return softwareSecurity;
    }

    public void setSoftwareSecurity(String softwareSecurity) {
        this.softwareSecurity = softwareSecurity;
    }

    @Override
    public String toString() {
        return super.toString() + " " + isBron + " " + softwareSecurity ;
    }
}
