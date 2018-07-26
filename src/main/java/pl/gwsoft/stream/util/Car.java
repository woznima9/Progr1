package pl.gwsoft.stream.util;

public class Car {
    private String brandAndmodel;
    private String colour;
    private int maxSpeed;

    public Car(String brandAndmodel, String colour, int maxSpeed) {
        this.brandAndmodel = brandAndmodel;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
    }

    public String getBrandAndmodel() {
        return brandAndmodel;
    }

    public void setBrandAndmodel(String brandAndmodel) {
        this.brandAndmodel = brandAndmodel;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandAndmodel='" + brandAndmodel + '\'' +
                ", colour='" + colour + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
