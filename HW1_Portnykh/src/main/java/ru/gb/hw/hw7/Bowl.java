package ru.gb.hw.hw7;

public class Bowl {
    private int food;

    Bowl(int food){
        this.food = food;
    }

    public boolean minusFood(final int input) {
        boolean output = false;
        if (food - input >= 0) {
            food -= input;
            output = true;
        }
        return output;
    }

    public void add(final int input) {
        this.food += input;
    }
}
