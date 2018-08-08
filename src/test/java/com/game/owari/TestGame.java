package com.game.owari;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestGame {

    private static Game game;

    @Before
    public void setup()
    {
        game = new Game();
    }

    @Test
    public void gameStartsWithPlayerOne()
    {
        Assert.assertEquals(Game.PLAYER.PLAYER_ONE, game.getCurrentPlayer());
    }

    @Test
    public void swapPlayerSwitchesToPlayerTwo()
    {
        game.swapPlayers();

        Assert.assertEquals(Game.PLAYER.PLAYER_TWO, game.getCurrentPlayer());
    }

    @Test
    public void swapPlayerTwiceSwitchesStayAtPlayerOne()
    {
        game.swapPlayers();
        game.swapPlayers();

        Assert.assertEquals(Game.PLAYER.PLAYER_ONE, game.getCurrentPlayer());
    }
}
