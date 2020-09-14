package com.softserve.academy.sprint02.task02;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyUtils {
    public Map<String, Double> averageRating(List<Caffee> coffees) {
        return coffees.stream().collect(Collectors.toMap(Caffee::getName,coffee -> Double.valueOf(coffee.getRating())));
    }
}
