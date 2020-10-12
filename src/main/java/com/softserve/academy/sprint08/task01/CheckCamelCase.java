package com.softserve.academy.sprint08.task01;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class CheckCamelCase {
    public static final String CAMELCASE_PATTERN = "[a-z][a-zA-Z]+";

    public static boolean checkAndPrint(Class clazz) {
        Stream<Method> result = Arrays.stream(clazz.getDeclaredMethods())
                .filter(method -> method.isAnnotationPresent(CamelCase.class))
                .filter(item -> !Pattern.matches(CAMELCASE_PATTERN, item.getName()));
        if(result.count() == 0) return true;
        else Arrays.stream(clazz.getDeclaredMethods())
                .filter(method -> method.isAnnotationPresent(CamelCase.class))
                .filter(item -> !Pattern.matches(CAMELCASE_PATTERN, item.getName())).forEach(item -> System.out.println("method " + clazz.getSimpleName()
                + "." + item.getName() +
                " doesn't satisfy camelCase naming convention"));
        return false;
    }
}
