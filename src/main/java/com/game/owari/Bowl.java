package com.game.owari;

public class Bowl {
    private int numOfBalls;

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
        final int ballsInBowl = numOfBalls;
        numOfBalls = 0;
        return ballsInBowl;
    }

    public void depositStone(int zero) {
    }

    public int updateAndGetScore() {
        return 0;
    }
}
