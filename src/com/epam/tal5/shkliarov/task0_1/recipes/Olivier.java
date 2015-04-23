package com.epam.tal5.shkliarov.task0_1.recipes;

import com.epam.tal5.shkliarov.task0_1.mean_vegetable.Cucumber;
import com.epam.tal5.shkliarov.task0_1.mean_vegetable.Potato;

/**
 * Created by Anton_Shkliarov on 4/23/2015.
 */
public class Olivier extends Recipe {
    public void makeOlivierSalad() {
        addIngredient(new Potato(200));
        addIngredient(new Cucumber(100));
    }
}
