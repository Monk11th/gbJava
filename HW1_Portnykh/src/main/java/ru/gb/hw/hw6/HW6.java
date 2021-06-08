package ru.gb.hw.hw6;

public class HW6 {
    /**
     * 1. Создать классы Собака и Кот с наследованием от класса Животное.
     * 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
     * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
     * 4. * Добавить подсчет созданных котов, собак и животных.
     */

    public static void main(String[] args) {
        Cat cat1 = new Cat("Кот1");
        Cat cat2 = new Cat("Кот2");
        Dog dog1 = new Dog("Пёс1");
        Dog dog2 = new Dog("Пёс2");
        Dog dog3 = new Dog("Пёс3");

        cat1.run(175);
        cat1.swim(1);
        cat2.run(205);
        dog1.run(50);
        dog1.swim(5);
        dog2.run(550);
        dog2.swim(15);
        dog3.run(500);
        dog3.swim(10);

        System.out.println("Коты - " + Cat.getCounter());
        System.out.println("Псы - " + Dog.getCounter());
        System.out.println("Все животные - " + Animal.getCounter());
    }
}