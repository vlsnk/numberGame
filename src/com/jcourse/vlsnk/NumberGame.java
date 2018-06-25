package com.jcourse.vlsnk;

import java.util.Random;

public class NumberGame {

    int number;
    Random random = new Random();

    public NumberGame() {
        this.number = random.nextInt();
    }

    public void startGame() {
        this.number = random.nextInt(10);
    }

    public boolean guess(int i) {
        return number == i ? true : false;
    }
}
