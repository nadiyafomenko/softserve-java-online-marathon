package com.softserve.academy.sprint02.task02;

import java.util.HashMap;
import java.util.Map;

public class Caffee implements DrinkReceipt, DrinkPreparation, Rating {
    private String name;
    private int rating;
    protected Map<String, Integer> ingredients;

    public Caffee(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    @Override
    public Map<String, Integer> makeDrink() {
        this.ingredients = new HashMap<>();
        this.ingredients.put("Water", 100);
        this.ingredients.put("Arabica", 20);
        return this.ingredients;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public DrinkReceipt addComponent(String componentName, int componentCount) {
        this.ingredients.put(componentName, componentCount);
        return this;
    }

    @Override
    public int getRating() {
        return this.rating;
    }

}
