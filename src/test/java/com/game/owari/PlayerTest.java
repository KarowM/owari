package com.game.owari;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest
{
    private static Player PLAYER;

    @Test
    public void playerGetScoreIsZeroAtStart()
    {
        PLAYER = new Player();

        Assert.assertEquals(PLAYER.getScore(), 0);
    }
}
