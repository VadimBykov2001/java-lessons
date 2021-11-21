package ru.tn.courses.vbogatyrev.v1.task2.models;

public class Car extends Product {
    private String color;
    private String brand;
    private String transmission;
    private String drive;

    public Car(Integer id, String color, String brand, double price, String transmission, String drive, int count) {
        super(id, price, count);
        this.color = color;
        this.brand = brand;
        this.transmission = transmission;
        this.drive = drive;
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

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    @Override
    public String toString() {
        return super.toString() + "; color : " + color + "; brand: " + brand + "; transmission: " + transmission + "; drive: " + drive + "\n";
    }
}
