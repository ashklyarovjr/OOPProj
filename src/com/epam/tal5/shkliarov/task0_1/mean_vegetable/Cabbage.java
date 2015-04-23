package com.epam.tal5.shkliarov.task0_1.mean_vegetable;

import com.epam.tal5.shkliarov.task0_1.vegetable_types.FlowerVegetable;

/**
 * Created by Anton_Shkliarov on 4/23/2015.
 */
public class Cabbage extends FlowerVegetable {

    public Cabbage() {
        super(44, "green", 100, "Cabbage");
    }

    public Cabbage(double weight) {
        super(44, "green", weight, "Cabbage");
    }

}
