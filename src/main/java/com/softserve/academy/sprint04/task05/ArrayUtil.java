package com.softserve.academy.sprint04.task05;

class Array<T> {
    private T[] array;

    public Array(T[] array) {
        this.array = array;
    }

    public T get(int index) {
        return array[index];
    }

    public int length() {
        return array.length;
    }
}

public class ArrayUtil {
    static <T> double averageValue(Array array) {
        double sum = 0;
        for (int i = 0; i < array.length(); i++) {
            Number item = (Number) array.get(i);
            sum += item.doubleValue();
        }
        return sum / array.length();
    }

    public static void main(String[] args) {
        Array<Integer> array = new Array<>(new Integer[]{1, 2, 4, 5});
        System.out.println(ArrayUtil.averageValue(array));
    }
}
