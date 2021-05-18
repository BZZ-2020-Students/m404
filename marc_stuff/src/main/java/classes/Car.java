package classes;

import java.awt.*;
import java.util.Objects;

public class Car {
    private double power;
    private String color;
    private String brand;
    private double fuelQuantity;
    private String licensePlate;

    public Car(double power, String color, String brand, double fuelQuantity, String licensePlate) {
        this.power = power;
        this.color = color;
        this.brand = brand;
        this.fuelQuantity = fuelQuantity;
        this.licensePlate = licensePlate;
    }

    public Car() {
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double drive(int distance) {
        double fuel = Math.random() * distance;
        this.fuelQuantity -= fuel;
        return fuel;
    }

    public double tank() {
        double tank = Math.random() * 30;
        this.fuelQuantity += tank;
        return tank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.power, power) == 0 && Double.compare(car.fuelQuantity, fuelQuantity) == 0 && Objects.equals(color, car.color) && Objects.equals(brand, car.brand) && Objects.equals(licensePlate, car.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, color, brand, fuelQuantity, licensePlate);
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                ", color=" + color +
                ", brand='" + brand + '\'' +
                ", fuelQuantity=" + fuelQuantity +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
