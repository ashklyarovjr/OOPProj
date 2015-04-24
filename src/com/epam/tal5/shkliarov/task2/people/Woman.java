package com.epam.tal5.shkliarov.task2.people;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Woman extends Human {

    public Woman(String name, String surname, float height, float weight) {
        super(false, name, surname, height, weight);
    }

    public Human bearABaby(Human dad) throws IOException {
        String surname;
        float height;
        float weight;
        Random random = new Random();
        boolean gender = random.nextDouble() > 0.5;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter baby's name:");
        String name = reader.readLine();
        surname = dad.getSurname();
        if (dad.isGender() == gender) {
            height = (float) 0.1 * dad.getHeight();
            weight = (float) 0.1 * dad.getWeight();
        } else {
            height = (float) 0.1 * this.getHeight();
            weight = (float) 0.1 * this.getWeight();
        }
        if (gender)
            return new Man(name,surname,height,weight);
        return new Woman(name,surname,height,weight);
    }

    @Override
    public boolean speak(Human human) {
        if (human != null) {
            System.out.println("Speaking is OK");
            return true;
        }
        else
            throw new IllegalArgumentException("Human can't speak to itself");
    }

    @Override
    public boolean endurePresence(Human human) {
        if (human == null)
            throw new IllegalArgumentException("Human hates to be lonely");
        double randomProbability = new Random().nextDouble();
        if (this.isGender() == human.isGender()) {
            if (randomProbability <= 0.05) {
                System.out.println("Enduring presence is OK");
                return true;
            }
        }
        else {
            if (randomProbability <= 0.7) {
                System.out.println("Enduring presence is OK");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Woman: " +
                "Name: " + this.getName() + " " +
                "Surname: " + this.getSurname() + " " +
                "Height: " + this.getHeight() + " " +
                "Weight: " + this.getWeight();
    }
}
