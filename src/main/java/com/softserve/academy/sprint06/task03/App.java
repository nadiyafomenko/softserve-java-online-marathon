package com.softserve.academy.sprint06.task03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

@SuppressWarnings("unchecked")
public class App {
    static BinaryOperator<String> greetingOperator = (str1, str2) -> "Hello " + str1 + " " + str2 + "!!!";

    public static List<String> createGreetings(List<Person> people, BinaryOperator<String> binaryOperator) {
        List<String> result = new ArrayList<>();
        people.forEach(person -> {
            result.add(binaryOperator.apply(person.name, person.surname));
        });
        return result;
    }
}
