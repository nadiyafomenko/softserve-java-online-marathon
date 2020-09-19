package com.softserve.academy.sprint03.task04;

public class Line {
    public static String drawLine(LineType lineType) {
        return "The line is " + lineType.name().toLowerCase() + "type";
    }
}
