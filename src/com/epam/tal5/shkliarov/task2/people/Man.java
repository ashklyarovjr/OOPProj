package com.epam.tal5.shkliarov.task2.people;

import java.util.Random;

public class Man extends Human implements BeingHuman {

    public Man(String name, String surname, float height, float weight) {
        super(true, name, surname, height, weight);
    }

    @Override
    public boolean speak(Human human) {
        if (human == null)
            throw new IllegalArgumentException("Human can't speak to itself");
        double randomProbability = new Random().nextDouble();
        if (this == human)
            if (randomProbability < 0.5)
                return false;
        System.out.println("Speaking is OK");
        return true;
    }

    @Override
    public boolean endurePresence(Human human) {
        if (human == null)
            throw new IllegalArgumentException("Human hates to be lonely");
        double randomProbability = new Random().nextDouble();
        if (this.isGender() == human.isGender()) {
            if (randomProbability <= 0.056) {
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
        return "Man: " +
                "Name: " + this.getName() + " " +
                "Surname: " + this.getSurname() + " " +
                "Height: " + this.getHeight() + " " +
                "Weight: " + this.getWeight();
    }
}
