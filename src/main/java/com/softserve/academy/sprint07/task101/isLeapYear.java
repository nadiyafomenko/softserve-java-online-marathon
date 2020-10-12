package com.softserve.academy.sprint07.task101;

import java.util.Calendar;

public class isLeapYear {
    public static boolean isLeapYear(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }
}
