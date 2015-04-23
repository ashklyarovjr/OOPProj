package com.epam.tal5.shkliarov.task0_1.recipes;

import com.epam.tal5.shkliarov.task0_1.mean_vegetable.Cucumber;
import com.epam.tal5.shkliarov.task0_1.mean_vegetable.Pepper;
import com.epam.tal5.shkliarov.task0_1.mean_vegetable.Tomato;

/**
 * Created by Anton_Shkliarov on 4/23/2015.
 */
public class Greek extends Recipe {

    public void makeGreekSalad() {
        addIngredient(new Cucumber(150));
        addIngredient(new Tomato(100));
        addIngredient(new Pepper(50));
    }
}
