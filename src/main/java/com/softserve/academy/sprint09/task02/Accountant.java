package com.softserve.academy.sprint09.task02;

import com.softserve.academy.sprint09.task01.ParallelCalculator;

public class Accountant {
    public static int sum(int x, int y) {
        ParallelCalculator parallelCalculator = new ParallelCalculator((a, b) -> x + y, x, y);
        Thread thread = new Thread(parallelCalculator);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return parallelCalculator.result;
    }

    public static void main(String[] args) {
        System.out.print(Accountant.sum(3,5));
    }
}
