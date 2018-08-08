package com.game.owari;

public class Player {

    private int points;

    public int getScore() {
        return points;
    }

    public void addToScore(int pointsToAdd) {
        points =+ pointsToAdd;
    }
}
