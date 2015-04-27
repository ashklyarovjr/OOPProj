package com.epam.tal5.shkliarov.task1;


import com.epam.tal5.shkliarov.task1.container.Container;
import com.epam.tal5.shkliarov.task1.objects.LEDLamp;
import com.epam.tal5.shkliarov.task1.objects.Lamp;
import com.epam.tal5.shkliarov.task1.objects.NeonLamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        Container container = initAContainer();
        container.add(initALedLamp());
        container.add(initANeonLamp());
        container.add(initALedLamp());
        container.add(initANeonLamp());
        container.add(initALedLamp());
        container.add(initANeonLamp());
        container.add(initANeonLamp());
        System.out.println();

        container.printAll();
        System.out.println();

        container.priceSort();
        System.out.println();

        container.printAll();
    }

    public static Container initAContainer() throws IOException {
        int size;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter size of container:");
        size =  Integer.parseInt(reader.readLine());
        return new Container(size);
    }

    public static LEDLamp initALedLamp() throws IOException {
        int price;
        int power;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please,  enter LED lamp's price:");
        price = Integer.parseInt(reader.readLine());
        System.out.println("Please, enter LED lamp's power:");
        power = Integer.parseInt(reader.readLine());
        return new LEDLamp(price,power);
    }

    public static NeonLamp initANeonLamp() throws IOException {
        int price;
        int size;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter Neon lamp's price:");
        price = Integer.parseInt(reader.readLine());
        System.out.println("Please, enter Neon lamp's size:");
        size = Integer.parseInt(reader.readLine());
        return new NeonLamp(price,size);
    }
}


