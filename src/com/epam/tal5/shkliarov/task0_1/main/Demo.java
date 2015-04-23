package com.epam.tal5.shkliarov.task0_1.main;

import com.epam.tal5.shkliarov.task0_1.recipes.Olivier;

/**
 * Created by Anton_Shkliarov on 4/23/2015.
 */
public class Demo {
    public static void main(String[] args) {
        Olivier olivier = new Olivier();
        olivier.makeOlivierSalad();
        olivier.showRecipe();
        System.out.println();

        olivier.sortByCalories();
        olivier.showRecipe();
        System.out.println();

        olivier.sortByWeight();
        olivier.showRecipe();
        System.out.println();

        olivier.getVegsFromNeededCaloriesInterval(10, 200);
        System.out.println();

    }
}
