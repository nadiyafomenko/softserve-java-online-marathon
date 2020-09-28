package com.softserve.academy.sprint05;

import java.util.regex.Pattern;

public class muExc extends Exception {
    private int i = 5;
    public muExc() {
    }

    public muExc(String message) {
        super(message);
    }

    private void importData() {
        if ( i > 5) throw new ArrayIndexOutOfBoundsException();
        else System.out.println(i);
    }

    public static void main(String[] args) {
        muExc m = new muExc();
        m.importData();
    }
}

