package com.epam.tal5.shkliarov.task1.objects;

/**
 * Created by Anton_Shkliarov on 4/22/2015.
 */
public class NeonLamp extends Lamp {
    protected static int quantity;
    private int size;

    public NeonLamp(int price, int size) {
        super(price, "Neon Lamp");
        this.size = size;
    }
}
