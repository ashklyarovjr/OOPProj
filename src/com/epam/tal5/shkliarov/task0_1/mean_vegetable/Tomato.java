package com.epam.tal5.shkliarov.task0_1.mean_vegetable;

import com.epam.tal5.shkliarov.task0_1.vegetable_types.FruitVegetable;

public class Tomato extends FruitVegetable {
    public Tomato(double weight) {
        super(55, "red", weight, "Tomato");
    }

    public Tomato() {
        super(55, "red", 100, "Tomato");
    }
}
