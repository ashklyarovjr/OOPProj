package com.epam.tal5.shkliarov.task0_1.vegetable_types;

/**
 * Created by Anton_Shkliarov on 4/22/2015.
 */
public abstract class Vegetable{
    protected int caloriesPer100g;
    protected double weight; //Weight counts in grams
    protected String color;
    protected String name;
    protected String type;
    protected String size;


    public Vegetable(int caloriesPer100g, String size, String name, String type, String color, double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight of the vegetable cannot be 0");
        }
        this.caloriesPer100g = caloriesPer100g;
        this.size = size;
        this.name = name;
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public Vegetable(int caloriesPer100g, String color, double weight, String name) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight of the vegetable cannot be 0");
        }
        this.caloriesPer100g = caloriesPer100g;
        this.color = color;
        this.weight = weight;
        this.name = name;
    }


    public double getCaloriesPer100g() {
        return caloriesPer100g;
    }

    public void setCaloriesPer100g(int caloriesPer100g) {
        this.caloriesPer100g = caloriesPer100g;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return name + " : " +
                "caloriesPer100g=" + caloriesPer100g +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
