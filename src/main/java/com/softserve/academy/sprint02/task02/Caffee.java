package com.softserve.academy.sprint02.task02;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Caffee implements DrinkReceipt, DrinkPreparation, Rating {
    private final String name;
    private final int rating;
    protected Map<String, Integer> ingredients;

    public Caffee(String name, int rating ) {
        ingredients = new HashMap<>();
        this.name = name;
        this.rating = rating;
    }

    @Override
    public Map<String, Integer> makeDrink() {
        addComponent("Water", 100);
        addComponent("Arabica", 20);
        return ingredients;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public DrinkReceipt addComponent(String componentName, int componentCount) {
        ingredients.put(componentName, componentCount);
        return this;
    }

    @Override
    public int getRating() {
        return this.rating;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Caffee caffee = (Caffee) obj;
        return Objects.equals(rating, caffee.rating) &&
                Objects.equals(name, caffee.name) &&
                Objects.equals(ingredients, caffee.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, ingredients);
    }

}
