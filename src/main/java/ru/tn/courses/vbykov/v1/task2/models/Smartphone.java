package ru.tn.courses.vbykov.v1.task2.models;

public class Smartphone extends Product {
    private String Color;
    private String Brand;
    private String Display_Resolution;
    private String Operating_System;

    public Smartphone(Integer id, String Color, String Brand, double price, String Display_Resolution, String Operating_System, int count) {
        super(id, price, count);
        this.Color = Color;
        this.Brand = Brand;
        this.Display_Resolution = Display_Resolution;
        this.Operating_System = Operating_System;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }
    public String getBrand() {
        return Brand;
    }
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }
    public String getDisplay_Resolution() {
        return Display_Resolution;
    }
    public void setDisplay_Resolution(String Display_Resolution) {
        this.Display_Resolution = Display_Resolution;
    }
    public String getOperating_System() {
        return Operating_System;
    }
    public void setOperating_System(String Operating_System) {
        this.Operating_System = Operating_System;
    }
    @Override
    public String toString() {
        return super.toString() + "; Color : " + Color + "; Brand: " + Brand + "; Display_Resolution: " + Display_Resolution + "; Operating_System: " + Operating_System + "\n";
    }
}
