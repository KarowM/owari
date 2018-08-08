package com.game.owari;

public class Bowl {
    private int numOfStones;
    private int despositedStones;

    public Bowl(int initialBalls) {
        numOfStones = initialBalls;
    }

    public Bowl() {
        this(0);
    }

    public int getStones() {
        return numOfStones;
    }

    public int takeAllStones() {
        final int ballsInBowl = numOfStones;
        numOfStones = 0;
        return ballsInBowl;
    }

    public void depositStone(int stones) {
        despositedStones += stones;
    }

    public int updateAndGetScore() {
        if (numOfStones == 1) {
            final int points = despositedStones;
            numOfStones += despositedStones;
            despositedStones = 0;
            return points;
        }
        numOfStones += despositedStones;
        despositedStones = 0;
        return 0;
    }
}
