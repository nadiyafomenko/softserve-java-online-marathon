package com.softserve.academy.sprint04.task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyUtils {
    // Code
    public boolean listMapCompare(List<String> list, Map<String, String> map) {
        List<String> leftList = map.values().stream().distinct().collect(Collectors.toList());
        List<String> rightList = list.stream().distinct().collect(Collectors.toList());
        Collections.sort(leftList);
        Collections.sort(rightList);
        return leftList.equals(rightList);
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "cc");
        map.put("2", "bb");
        map.put("3", "cc");
        map.put("4", "aa");
        map.put("5", "cc");

        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("aa");
        list.add("cc");

        System.out.println(new MyUtils().listMapCompare(list, map));
    }
}
