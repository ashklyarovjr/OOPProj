package com.epam.tal5.shkliarov.task2.people;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Woman extends Human {

    public Woman(String name, String surname, float height, float weight) {
        super(false, name, surname, height, weight);
    }

    private static String babyNameRequest() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter baby's name:");
        return reader.readLine();
    }


    /**
     * Determines who will bear, boy or girl
     *
     * */
    public Human bearABaby(Human dad) throws IOException {
        float height;
        float weight;
        Random random = new Random();
        boolean gender = random.nextDouble() > 0.5;
        if (gender){
            System.out.println("It's a boy!");
            height = (float) 0.1 * dad.getHeight();
            weight = (float) 0.1 * dad.getWeight();
            return new Man(babyNameRequest(),dad.getSurname(),height,weight);
        }
        System.out.println("It's a girl!");
        height = (float) 0.1 * this.getHeight();
        weight = (float) 0.1 * this.getWeight();
        return new Woman(babyNameRequest(),dad.getSurname(),height,weight);
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
        if (!genderMatch(this, human)) {
            if (randomProbability <= 0.05) {
                System.out.println("Enduring presence is OK");
                return true;
            }
        } else {
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
