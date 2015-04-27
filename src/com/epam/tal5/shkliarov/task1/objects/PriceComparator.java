package com.epam.tal5.shkliarov.task1.objects;

import java.util.Comparator;

/**
 * Created by Anton on 4/27/2015.
 */
public class PriceComparator implements Comparator<Lamp> {
    @Override
    public int compare(Lamp o1, Lamp o2) {
        if (o1 != null && o2 !=null) {
            if (o1.getPrice() > o2.getPrice())
                return 1;
            if (o1.getPrice() < o2.getPrice())
                return -1;
        }
        return 0;
    }
}
