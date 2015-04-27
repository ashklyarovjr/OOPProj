package com.epam.tal5.shkliarov.task1.objects;


public class NeonLamp extends Lamp {
    protected static int quantity;
    private int size;


    public NeonLamp(int price, int size) {
        super(price, "Neon Lamp");
        this.size = size;
        quantity++;
    }

    public static int getQuantity() {
        return quantity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "NeonLamp: " +
                "Price: " + getPrice() + " " +
                "Size: " + size;
    }
}
