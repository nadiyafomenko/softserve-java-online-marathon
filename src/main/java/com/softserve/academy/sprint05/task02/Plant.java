package com.softserve.academy.sprint05.task02;

import java.util.Arrays;

public class Plant {
    private String name;
    private Color color;
    private Type type;

    public Plant(String type, String color, String name) throws ColorException, TypeException {
        if (Arrays.stream(Color.values()).noneMatch(c -> c.name().equalsIgnoreCase(color)))
            throw new ColorException("Invalid value " + color + " for field color");
        if (Arrays.stream(Type.values()).noneMatch(t -> t.name().equalsIgnoreCase(type)))
            throw new TypeException("Invalid value " + type + " for field type");

        this.type = Type.valueOf(type.toUpperCase());
        this.color = Color.valueOf(color.toUpperCase());
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    @Override
    public String toString() {
        return "{type: " + type.name() +
                ", color: " + color.name() +
                ", name: " + name + "}";
    }
}

