package com.softserve.academy.sprint04.task04;

public class ArrayUtil {
    public static <T> T setAndReturn(T [] array, T value, int pos) {
        if(array.length < pos) throw new ArrayIndexOutOfBoundsException();
        array[pos] = value;
        return array[pos];
    }
}
