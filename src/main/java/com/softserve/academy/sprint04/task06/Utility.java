package com.softserve.academy.sprint04.task06;

import java.util.Arrays;
import java.util.Comparator;

@SuppressWarnings("unchecked")
public class Utility {
    public static <T extends Person> void sortPeople(T[] people, Comparator comparator) {
        Arrays.sort(people, comparator);
    }
}
