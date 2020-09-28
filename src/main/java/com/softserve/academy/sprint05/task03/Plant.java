package com.softserve.academy.sprint05.task03;

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

    @Override
    public String toString() {
        return "{type: " + type.name() +
                ", color: " + color.name() +
                ", name: " + name + "}";
    }

    public static Plant tryCreatePlant(String type, String color, String name) throws TypeException, ColorException {
        try {
            return new Plant(type, color, name);
        } catch (ColorException e) {
           return tryCreatePlant(type, "red", name);
        } catch (TypeException e) {
           return tryCreatePlant("ordinary", color, name);
        }
    }

    public static void main(String[] args) throws ColorException, TypeException {
        System.out.println(tryCreatePlant("rare", "smth", "name"));
        System.out.println(tryCreatePlant("smth", "white", "name"));
        System.out.println(tryCreatePlant("smth", "smth", "name"));
    }
}

