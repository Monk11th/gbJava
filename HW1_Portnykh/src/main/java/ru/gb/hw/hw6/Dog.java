package ru.gb.hw.hw6;

public class Dog extends Animal {
    private static int counter = 0;
    private final int runDist = 500;
    private final int swimDist = 10;

    public Dog(String name) {
        super(name);
        counter++;
    }
    @Override
    public void run(int distance) {
        if (distance <= runDist) {
            System.out.printf("Пёс пробежал %d метров%n", distance);
        } else {
            System.out.printf("%d метров слишком большое расстояние для пса%n", distance);
        }
    }
    @Override
    public void swim(int distance) {
        if (distance <= swimDist) {
            System.out.printf("Пёс проплыл %d метров%n", distance);
        } else {
            System.out.printf("%d метров слишком большое расстояние для пса%n", distance);
    }
}
public static int getCounter() {
    return counter;
    }
}


