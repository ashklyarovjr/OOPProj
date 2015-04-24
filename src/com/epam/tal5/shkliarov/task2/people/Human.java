package com.epam.tal5.shkliarov.task2.people;

import java.io.IOException;
import java.util.Random;

import static java.lang.Math.abs;

public abstract class Human implements BeingHuman {

    private boolean gender;
    private String name;
    private String surname;
    private float height;
    private float weight;

    public Human(boolean gender, String name, String surname, float height, float weight) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public boolean spendTimeTogether(Human human) {
        if (human == null)
            throw new IllegalArgumentException("Human hates to be lonely");
        float difference = abs(this.getHeight() - human.getHeight());
        double probability = new Random().nextDouble();
        if (difference < (0.1 * this.getHeight()) || difference < (0.1 * human.getHeight())) {
            if (probability <= 0.95) {
                System.out.println("Spending time together is OK");
                return true;
            }
        } else if (difference >= (0.1 * this.getHeight()) || difference >= (0.1 * human.getHeight())) {
            if (probability <= 0.85) {
                System.out.println("Spending time together is OK");
                return true;
            }
        }
        return false;
    }

    @Override
    public Human haveARelationship(Human human) throws IOException {
        if (human == null)
            throw new IllegalArgumentException("Human can't be in a relationship with itself");
        if (this.speak(human) && this.endurePresence(human) && this.spendTimeTogether(human))
            if (this.isGender() != human.isGender())
                if (this.isGender()) {
                    Woman woman = new Woman(human.getName(), human.getSurname(), human.getHeight(), human.getWeight());
                    System.out.println("Congratulations, you'll have a baby!");
                    return woman.bearABaby(this);
                } else {
                    Woman woman = new Woman(this.getName(), this.getSurname(), this.getHeight(), this.getWeight());
                    System.out.println("Congratulations, you'll have a baby!");
                    return woman.bearABaby(human);
                }
        System.out.println("No happy end...");
        return null;
    }

    @Override
    public String toString() {
        return "Human " +
                "Gender = " + isGender() +
                ", Name = '" +  + '\'' +
                ", Surname = '" + surname + '\'' +
                ", Height = " + height +
                ", Weight = " + weight +
                '}';
    }
}
