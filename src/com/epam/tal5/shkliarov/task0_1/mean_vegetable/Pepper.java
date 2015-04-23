package com.epam.tal5.shkliarov.task0_1.mean_vegetable;

import com.epam.tal5.shkliarov.task0_1.vegetable_types.FruitVegetable;

/**
 * Created by Anton_Shkliarov on 4/23/2015.
 */
public class Pepper extends FruitVegetable{
    public Pepper(double weight) {
        super(15, "red", weight, "Pepper");
    }

    public Pepper() {
        super(15, "red", 100, "Pepper");
    }
}
