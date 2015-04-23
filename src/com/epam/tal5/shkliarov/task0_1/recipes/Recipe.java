package com.epam.tal5.shkliarov.task0_1.recipes;

import com.epam.tal5.shkliarov.task0_1.vegetable_types.Vegetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Anton_Shkliarov on 4/23/2015.
 */
public abstract class Recipe {
    protected List<Vegetable> ingredients = new ArrayList<Vegetable>();

    public void addIngredient(Vegetable vegetable){
        ingredients.add(vegetable);
    }

    public void showRecipe() {
        if (!ingredients.isEmpty()) {
            System.out.println("List:");
            for (Vegetable ingredient : ingredients) {
                System.out.println(ingredient.toString());
            }
        }else {
            System.out.println("Your ingredient list is empty.");
        }
    }

    public int totalCaloriesCount() {
        double total = 0;
        for (int i = 0; i < ingredients.size(); i++) {
            total += ingredients.get(i).getWeight() * (ingredients.get(i).getCaloriesPer100g() / 100);
        }
        return (int) total;
    }

    public void getVegsFromNeededCaloriesInterval(double from, double to) {
        for (int i = 0; i < ingredients.size(); i++) {
            if ((ingredients.get(i).getCaloriesPer100g() >= from) && (ingredients.get(i).getCaloriesPer100g() <= to)){
                System.out.println(ingredients.get(i).toString());
            }
        }
    }

    public void sortByWeight() {
        Collections.sort(ingredients, new WeightComparator());
    }

    public void sortByCalories() {
        Collections.sort(ingredients, new CaloriesComparator());
    }
}
