package com.softserve.academy.sprint08.task03;

@TestSuite(value = {"method", "method2"})
public class App {
    public static String method() { return "hello"; }
    public static void main(String[] args) {
        TestSuitHandler.run(App.class);
    }
}
