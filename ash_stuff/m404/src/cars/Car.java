package cars;

public class Car {
     int power;
     String colour;
     String brand;
     String licensePlate;
     int fuel;

    public void drive(int distance){
        for (int i = 0; i < distance; i++) {
            fuel--;
        }
    }

    public void tankFuel(int ammount){
        fuel += ammount;
    }

    public Car(int power, String colour, String brand, String licensePlate, int fuel) {
        this.power = power;
        this.colour = colour;
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.fuel = fuel;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
