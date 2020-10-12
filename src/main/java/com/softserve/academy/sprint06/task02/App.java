package com.softserve.academy.sprint06.task02;

import java.util.Arrays;
import java.util.function.Consumer;

public class App {
    static Consumer<double[]> cons = array -> {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 2) array[i] *= 0.8;
            else array[i] *= 0.9;
        }
    };

    public static double[] getChanged(double[] initialArray, Consumer<double[]> cons) {
        double[] arrayCopy = Arrays.copyOf(initialArray, initialArray.length);
        cons.accept(arrayCopy);
        return arrayCopy;
    }
}
