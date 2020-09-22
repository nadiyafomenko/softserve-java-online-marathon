package com.softserve.academy.sprint04.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyUtils {
    // Code
    public Map<String, List<String>> createNotebook(Map<String, String> phones) {
        Map<String, List<String>> result = new HashMap<>();
        phones.forEach((key, value) -> {
            if (!result.containsKey(value)) {
                result.put(value, new ArrayList<>(Arrays.asList(key)));
            } else {
                result.get(value).add(key);
            }
        });
        return result;
    }

    public static void main(String... args) {
        Map<String, String> phones = new HashMap<>();
        phones.put("0967654321", "Petro");
        phones.put("0677654321", "Petro");
        phones.put("0501234567", "Ivan");
        phones.put("0970011223", "Stepan");
        phones.put("0631234567", "Ivan");
        System.out.println(new MyUtils().createNotebook(phones));
    }
}
