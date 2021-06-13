package ru.gb.hw.hw7;

public class Cat {
    private String name;
    private final int appetite;
    private boolean fullness;

    public Cat(final String name, final int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(final Bowl p) {
        if (!fullness) {
            fullness = p.minusFood(appetite);
        }
    }

    public void info() {
        System.out.printf("Кот %s имеет аппетит %d %s\n", name, appetite, fullness ? "Сыт" : "Голоден");
    }
}
