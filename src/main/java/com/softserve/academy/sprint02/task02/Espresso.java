package com.softserve.academy.sprint02.task02;

import java.util.Map;

public class Espresso extends Caffee {

    public Espresso(String name, int rating){
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        this.ingredients.put("Water", 50);
        this.ingredients.put("Arabica", 20);
        return this.ingredients;
    }
}
