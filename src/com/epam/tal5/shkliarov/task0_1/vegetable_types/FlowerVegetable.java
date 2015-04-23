package com.epam.tal5.shkliarov.task0_1.vegetable_types;

/**
 * Created by Anton_Shkliarov on 4/23/2015.
 */
public abstract class FlowerVegetable extends Vegetable {
    public FlowerVegetable(int caloriesPer100g, String color, double weight, String name) {
        super(caloriesPer100g, color, weight, name);
        setSize("Medium");
        setType("Flower Vegetable");
    }

    public FlowerVegetable(int caloriesPer100g, String size, String name, String type, String color, double weight) {
        super(caloriesPer100g, size, name, type, color, weight);
    }
}
