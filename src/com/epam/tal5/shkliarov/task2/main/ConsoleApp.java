package com.epam.tal5.shkliarov.task2.main;

import com.epam.tal5.shkliarov.task2.people.Human;
import com.epam.tal5.shkliarov.task2.people.Man;
import com.epam.tal5.shkliarov.task2.people.Woman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConsoleApp {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter : 'MW' or 'WM' or 'MM' or 'WW', it depends on your situation.");
        String variant =  reader.readLine();
        char[] variantCases = variant.toCharArray();
        Human human1;
        Human human2;
        switch (variantCases[0]) {
            case 'M':
                human1 = initAMan();
                switch (variantCases[1]) {
                    case 'W':
                        human2 = initAWoman();

                        System.out.println(human1.toString());
                        System.out.println(human2.toString());

                        printAResult(human1.haveARelationship(human2));
                        break;
                    case 'M':
                        human2 = initAMan();

                        System.out.println(human1.toString());
                        System.out.println(human2.toString());

                        printAResult(human1.haveARelationship(human2));
                        break;
                }
                break;
            case 'W':
                human1 = initAWoman();
                switch (variantCases[1]) {
                    case 'M':
                        human2 = initAMan();

                        System.out.println(human1.toString());
                        System.out.println(human2.toString());

                        printAResult(human1.haveARelationship(human2));
                        break;
                    case 'W':
                        human2 = initAWoman();

                        System.out.println(human1.toString());
                        System.out.println(human2.toString());

                        printAResult(human1.haveARelationship(human2));
                        break;
                }
                break;
        }
    }


    /**
     * New Man object initiation
     * */
    public static Man initAMan() throws IOException {
        String name;
        String surname;
        float height;
        float weight;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter man's name: ");
        name = reader.readLine();

        System.out.println("Please, enter man's surname: ");
        surname = reader.readLine();

        System.out.println("Please, enter man's height: ");
        height = Float.parseFloat(reader.readLine());

        System.out.println("Please, enter man's weight: ");
        weight = Float.parseFloat(reader.readLine());

        return new Man(name,surname,height,weight);
    }


    /**
     * New Woman object initiation
     * */
    public static Woman initAWoman() throws IOException {
        String name;
        String surname;
        float height;
        float weight;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter woman's name: ");
        name = reader.readLine();

        System.out.println("Please, enter woman's surname: ");
        surname = reader.readLine();

        System.out.println("Please, enter woman's height: ");
        height = Float.parseFloat(reader.readLine());

        System.out.println("Please, enter woman's weight: ");
        weight = Float.parseFloat(reader.readLine());

        return new Woman(name,surname,height,weight);
    }

    /**
     * Printing a result of operation with humans through toString method
     * @param human takes any link of Human type
     * */
    public static void printAResult(Human human) {
        if (human == null) {
            System.out.println("Sorry, no baby here..");
            return;
        }
        System.out.println(human.toString());
    }
}
