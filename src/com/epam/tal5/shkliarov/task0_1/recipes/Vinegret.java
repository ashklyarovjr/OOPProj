package com.epam.tal5.shkliarov.task0_1.recipes;


import com.epam.tal5.shkliarov.task0_1.mean_vegetable.Carrot;
import com.epam.tal5.shkliarov.task0_1.mean_vegetable.Phaseolus;
import com.epam.tal5.shkliarov.task0_1.mean_vegetable.Potato;

public class Vinegret extends Recipe {
     public void makeVinegretSalad() {
         addIngredient(new Phaseolus(100));
         addIngredient(new Potato(50));
         addIngredient(new Carrot(70));
     }
}
