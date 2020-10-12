package com.softserve.academy.sprint07.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unchecked")
public class MyUtils {
    private String refactorName(String name) {
        String _name = name.replaceAll("[ ]", "");
        return _name.substring(0, 1).toUpperCase() + _name.substring(1).toLowerCase();
    }

    public Stream<String> nameList(Map<String, Stream<String>> map) {
        List<String> newList = new ArrayList<>();
        map.values().stream().filter(Objects::nonNull).forEach(stream -> {
            List<String> temp = stream.filter(Objects::nonNull).filter(str -> !str.isEmpty()).collect(Collectors.toList());
        });
        System.out.println(newList.stream().map(this::refactorName).distinct().sorted().collect(Collectors.toList()));
        return newList.stream().map(this::refactorName).distinct().sorted();
    }

    public static void main(String[] args) {
        Map<String, Stream<String>> map = new HashMap<>();
        List<String> first = new ArrayList<>();
        first.add(" iVan");
        first.add("PeTro ");
        first.add(" Ira ");

        List<String> second = new ArrayList<>();
        second.add("STepan");
        second.add("ira ");
        second.add(" Andriy ");
        second.add("an na");

        List<String> third = new ArrayList<>();
        third.add(null);
        third.add("");

        map.put("jdc", first.stream());
        map.put("cdc", second.stream());
        map.put("fvdfv", third.stream());

        System.out.println(new MyUtils().nameList(map));
    }
}
