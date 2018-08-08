package com.game.owari;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest
{
    public static final int pointsToAdd = 1;
    private static Player PLAYER;

    @Before
    public void setup()
    {
        PLAYER = new Player();
    }

    @Test
    public void getScoreIsZeroAtStart()
    {
        Assert.assertEquals(PLAYER.getScore(), 0);
    }

    @Test
    public void addToScoreAddsToPlayerScore()
    {
        PLAYER.addToScore(pointsToAdd);

        Assert.assertEquals(PLAYER.getScore(), pointsToAdd);
    }
}
