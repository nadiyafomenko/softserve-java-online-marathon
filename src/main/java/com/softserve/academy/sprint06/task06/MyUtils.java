package com.softserve.academy.sprint06.task06;

import java.util.List;
import java.util.function.Predicate;

public class MyUtils {
    public static int findMaxByCondition(List<Integer> numbers, Predicate<Integer> pr) {
        return numbers.stream().filter(number -> pr.test(number)).mapToInt(Integer::intValue).max().getAsInt();
    }
}
