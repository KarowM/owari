package com.game.owari;

public class Game {

    public static enum PLAYER
    {
        PLAYER_ONE,
        PLAYER_TWO
    }

    private PLAYER currentPlayer;

    public Game()
    {
        currentPlayer = PLAYER.PLAYER_ONE;
    }

    public PLAYER getCurrentPlayer() {
        return currentPlayer;
    }

    public void swapPlayers() {
        currentPlayer = currentPlayer == PLAYER.PLAYER_ONE ? PLAYER.PLAYER_TWO : PLAYER.PLAYER_ONE;
    }
}
