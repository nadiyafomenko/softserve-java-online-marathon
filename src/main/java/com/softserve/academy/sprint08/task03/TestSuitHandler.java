package com.softserve.academy.sprint08.task03;

import java.lang.reflect.Method;

public class TestSuitHandler {
    static void run(Class<?> clazz) {
        if (!clazz.isAnnotationPresent(TestSuite.class)) {
            System.out.print("Class " + clazz.getSimpleName() + " isn't annotated");
            return;
        }

        String[] annotationDeclaredMethods = clazz.getAnnotation(TestSuite.class).value();
        for (String name : annotationDeclaredMethods) {
            try {
                Method method = clazz.getMethod(name, new Class[]{});
                System.out.println("\tMethod " + clazz.getSimpleName() + "." + method.getName() + " started\t");
                Object instance = Class.forName(clazz.getName()).getConstructors()[0].newInstance();
                System.out.println(method.invoke(instance).toString());
                System.out.println("\tMethod " + clazz.getSimpleName() + "." + method.getName() + " finished\t");
            } catch (NoSuchMethodException e) {
                System.out.println("Method with name " + name + " doesn't exists or not public in class " + clazz.getSimpleName());
            } catch (Exception e) {

            }
        }

    }
}
