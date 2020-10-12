package com.softserve.academy.sprint06.task01;

import java.util.Arrays;
import java.util.function.Predicate;

public class MyUtils {
    public static int getCount(int[] array, Predicate<Integer> predicate) {
        Count count = arr -> (int) Arrays.stream(arr).filter(item -> predicate.test(item)).count();
        return count.count(array);
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 6, 0, -1, -4, -7};
        int count = getCount(new int[] {1, 2, 3, -1, -5, 0}, i -> i > 2);
        System.out.println(count);
    }
}
