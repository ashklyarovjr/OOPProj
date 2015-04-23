package com.epam.tal5.shkliarov.task0_1.mean_vegetable;

import com.epam.tal5.shkliarov.task0_1.vegetable_types.FruitVegetable;

/**
 * Created by Anton_Shkliarov on 4/23/2015.
 */
public class Cucumber extends FruitVegetable {
    public Cucumber(double weight) {
        super(10, "green", weight, "Cucumber");
    }

    public Cucumber() {
        super(10, "green", 100, "Cucumber");
    }
}
