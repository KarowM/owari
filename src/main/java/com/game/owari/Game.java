package com.game.owari;

public class Game {
    private int currentPlayer;

    public Game()
    {
        currentPlayer = 1;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void swapPlayers() {
        currentPlayer = 3 - currentPlayer;
    }
}
