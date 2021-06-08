package ru.gb.hw.hw6;

public abstract class Animal {
    public String name;
    private static int counter = 0;

    public Animal(String name) {
        this.name = name;
        counter++;
    }

    public abstract void run(final int distance);

    public abstract void swim(final int distance);

    public static int getCounter() {
        return counter;
    }
}