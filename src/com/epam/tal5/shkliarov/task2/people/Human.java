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

    protected static boolean genderMatch(Human human1, Human human2) {
        return human1.isGender() != human2.isGender();
    }

    protected static boolean almostHappyEnd(Human human1, Human human2) {
        return human1.speak(human2) && human1.endurePresence(human2) && human1.spendTimeTogether(human2);
    }

    protected static boolean differenceIsLessThan10Percent(Human human1, Human human2) {
        float difference = abs(human1.getHeight() - human2.getHeight());
        return (difference < (0.1 * human1.getHeight()) || difference < (0.1 * human2.getHeight()));
    }

    protected static boolean differenceIsMoreThan10Percent(Human human1, Human human2) {
        float difference = abs(human1.getHeight() - human2.getHeight());
        return difference >= (0.1 * human1.getHeight()) || difference >= (0.1 * human2.getHeight());
    }

    @Override
    public boolean spendTimeTogether(Human human) {
        if (human == null)
            throw new IllegalArgumentException("Human hates to be lonely");
        double probability = new Random().nextDouble();
        if (differenceIsLessThan10Percent(this, human)) {
            if (probability <= 0.95) {
                System.out.println("Spending time together is OK");
                return true;
            }
        } else if (differenceIsMoreThan10Percent(this, human)) {
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
        if (almostHappyEnd(this, human)) {
            if (genderMatch(this, human)) {
                if (this.isGender()) {
                    System.out.println("Congratulations, you'll have a baby!");
                    return ((Woman) human).bearABaby(this);
                } else {
                    System.out.println("Congratulations, you'll have a baby!");
                    return ((Woman) this).bearABaby(human);
                }
            }
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
                ", Weight = " + weight;
    }
}
