package com.epam.tal5.shkliarov.task0_1.recipes;

import com.epam.tal5.shkliarov.task0_1.vegetable_types.Vegetable;

import java.util.Comparator;

/**
 * Created by Anton_Shkliarov on 4/23/2015.
 */
public class WeightComparator implements Comparator<Vegetable> {
    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        if (o1.getWeight() > o2.getWeight())
            return 1;
        if (o1.getWeight() < o2.getWeight())
            return -1;
        return 0;
    }
}
