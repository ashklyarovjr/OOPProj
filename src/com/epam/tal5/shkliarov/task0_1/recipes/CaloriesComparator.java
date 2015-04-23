package com.epam.tal5.shkliarov.task0_1.recipes;

import com.epam.tal5.shkliarov.task0_1.vegetable_types.Vegetable;

import java.util.Comparator;

/**
 * Created by Anton_Shkliarov on 4/23/2015.
 */
public class CaloriesComparator implements Comparator<Vegetable> {

    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        if (o1.getCaloriesPer100g() > o2.getCaloriesPer100g())
            return 1;
        if (o1.getCaloriesPer100g() < o2.getCaloriesPer100g())
            return -1;
        return 0;
    }
}
