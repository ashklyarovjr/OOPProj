package com.epam.tal5.shkliarov.task1.objects;


public abstract class Lamp {
    private int price;
    private String name;

    public Lamp(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lamp: " +
                "Price: " + price +
                ", Name: '" + name + '\'' +
                '}';
    }
}
