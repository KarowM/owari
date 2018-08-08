package com.game.owari;

public class Bowl {
    private final int numOfBalls;

    public Bowl(int initialBalls) {
        numOfBalls = initialBalls;
    }

    public Bowl() {
        this(0);
    }

    public int getStones() {
        return numOfBalls;
    }

    public int takeAllStones() {
        return 0;
    }
}
