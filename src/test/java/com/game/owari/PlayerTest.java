package com.game.owari;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest
{
    private static Player PLAYER;

    @Before
    public void setup()
    {
        PLAYER = new Player();
    }

    @Test
    public void getScoreIsZeroAtStart()
    {
        Assert.assertEquals(0, PLAYER.getScore());
    }

    @Test
    public void addToScoreAddsToPlayerScore()
    {
        int pointsToAdd = 1;
        PLAYER.addToScore(pointsToAdd);

        Assert.assertEquals(pointsToAdd, PLAYER.getScore());
    }
}
