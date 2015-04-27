package com.epam.tal5.shkliarov.task1.container;

import com.epam.tal5.shkliarov.task1.objects.LEDLamp;
import com.epam.tal5.shkliarov.task1.objects.Lamp;
import com.epam.tal5.shkliarov.task1.objects.NeonLamp;
import com.epam.tal5.shkliarov.task1.objects.PriceComparator;

import java.util.Arrays;

/**
 * Created by Anton_Shkliarov on 4/23/2015.
 */
public class Container {
    private static final int MAX_COUNT = 10;
    private int totalQuantity;
    private Lamp[] lamps;

    public Container(int items) {
        if (items < 1)
            items = MAX_COUNT;
        this.lamps = new Lamp[items];
    }

    public Container(Lamp[] lamps) {
        this.lamps = lamps;
    }

    public Container() {
        this.lamps = new Lamp[MAX_COUNT];
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Lamp[] getLamps() {
        return lamps;
    }

    public void setLamps(Lamp[] lamps) {
        this.lamps = lamps;
    }

    public static int getMAX_COUNT() {
        return MAX_COUNT;
    }

    public void add(Lamp lamp) {

        if (totalQuantity < lamps.length) {
            lamps[totalQuantity] = lamp;
        } else {
            Lamp[] additional = new Lamp[lamps.length * 2];
            System.arraycopy(lamps, 0, additional, 0, lamps.length);
            additional[totalQuantity] = lamp;
            lamps = additional;
        }
        totalQuantity++;
    }

    public void priceSort(){
        Arrays.sort(lamps, new PriceComparator());
    }

    public void printAll() {
        for (int i = 0; i < totalQuantity; i++) {
            System.out.println(lamps[i].toString());
        }
    }

    public Lamp getOneByIndex(int index){
        return lamps[index];
    }

    public void printOneByIndex(int index){
        System.out.println(getOneByIndex(index).toString());
    }

    public void countAll(){
        System.out.println("Total count is:  " + getTotalQuantity() + "\n" +
        "LEDLamps: " + LEDLamp.getQuantity() + "\n" +
        "NeonLamps: " + NeonLamp.getQuantity());
    }


}
