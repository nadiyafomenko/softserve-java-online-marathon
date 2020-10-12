package com.softserve.academy.sprint06.task06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class User {
    public final List<Integer> values = new ArrayList<Integer>();

    int getFilterdValue(BiFunction function, Predicate predicate) {
        return (int) function.apply(function,predicate);
    }

    int getMaxValueByCondition(Predicate<Integer> predicate) {

       return 0;
    }
}
