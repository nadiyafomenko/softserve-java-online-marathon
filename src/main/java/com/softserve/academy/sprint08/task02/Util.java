package com.softserve.academy.sprint08.task02;

import java.time.LocalDate;

@SuppressWarnings("unchecked")
public class Util {
    public static void review(String className) {
        Class<?> clazz = null;
        try {
            clazz = Class.forName(className);
            if (clazz.isAnnotationPresent(Review.class)) {
                String date;
                if (clazz.getAnnotation(Review.class).date().equals("today")) {
                    date = LocalDate.now().toString();
                } else {
                    date = clazz.getAnnotation(Review.class).date();
                }
                System.out.println("Class " + className + " was reviewed " +
                        date + " by " +
                        clazz.getAnnotation(Review.class).reviewer() + ".");
            } else {
                System.out.println("Class " + className + " isn't marked as Reviewed");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class " + className + " was not found");
        }
    }
}

