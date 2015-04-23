package com.epam.tal5.shkliarov.task0_1.mean_vegetable;

import com.epam.tal5.shkliarov.task0_1.vegetable_types.RootVegetable;

public class Carrot extends RootVegetable {

    public Carrot(double weight) {
        super(40, "orange", weight, "Carrot");
    }

    public Carrot() {
        super(40, "orange", 100, "Carrot");
    }
}
