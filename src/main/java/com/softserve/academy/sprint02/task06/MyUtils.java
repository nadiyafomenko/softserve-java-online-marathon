package com.softserve.academy.sprint02.task06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class MyUtils {
    public List<Shape> maxAreas(List<Shape> shapes) {
        List<Shape> list = new ArrayList<>();
        Map<String, List<Shape>> map = shapes.stream().distinct()
                .collect(Collectors.groupingBy(Shape::getName));

        for(Map.Entry<String, List<Shape>> entry : map.entrySet()){
            list.add(entry.getValue().stream().distinct()
                    .max(Comparator.comparing(Shape::getArea))
                    .orElseThrow(NoSuchElementException::new));

        }
        return list;
    }
}
