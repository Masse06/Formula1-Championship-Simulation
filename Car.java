public class Car {
    private String brand;
    private double maxSpeed;
    private Pilot pilot;

    public Car(String brand, double maxSpeed, Pilot pilot) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.pilot = pilot;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public String showInfo() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", pilot=" + pilot +
                '}';
    }

    public String toString() {
        return brand + "," + maxSpeed + "," + pilot;
    }
}
