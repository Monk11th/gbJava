package ru.gb.hw.hw6;

public class Cat extends Animal {
    private static int counter = 0;
    private final int runDist = 200;

    public Cat(String name) {
        super(name);
        counter++;
    }

    @Override
    public void run(int distance) {
        if (distance <= runDist) {
            System.out.printf("Кот пробежал %d метров%n", distance);
        } else {
            System.out.printf("%d метров слишком большое расстояние для кота%n", distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.printf("Коты не плавают%n");
    }

    public static int getCounter() {
        return counter;
    }
}
