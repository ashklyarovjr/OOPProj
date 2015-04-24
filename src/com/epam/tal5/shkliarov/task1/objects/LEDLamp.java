package com.epam.tal5.shkliarov.task1.objects;


public class LEDLamp extends Lamp {
    protected static int quantity;
    private double power;

    public LEDLamp(int price, double power) {
        super(price, "LEDLamp");
        this.power = power;
    }

    public static int getQuantity() {
        return quantity;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
