package com.game.owari;

import org.junit.Assert;
import org.junit.Test;

public class TestGame {

    private static Game game = new Game();

    @Test
    public void gameStartsWithPlayerOne()
    {
        Assert.assertEquals(game.getCurrentPlayer(), 1);
    }
}
