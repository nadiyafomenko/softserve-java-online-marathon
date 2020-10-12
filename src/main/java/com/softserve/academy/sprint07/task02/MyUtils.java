package com.softserve.academy.sprint07.task02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyUtils {

    public static String getDateAfterToday(int years, int months, int days) {
        LocalDate localDate = LocalDate.now();
        LocalDate newDate = localDate.plusYears(years).plusMonths(months).plusDays(days);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        return newDate.format(formatter);
    }

    public static void main(String[] args) {
        System.out.println(getDateAfterToday(3,18,27));
    }
}
