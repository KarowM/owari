package com.game.owari;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBowl {

    private static Bowl BOWL;

    @Before
    public void setup()
    {
        BOWL = new Bowl();
    }

    @Test
    public void bowlCreationWithNoArgsCreatesEmptyBowl()
    {
        Assert.assertEquals(BOWL.getStones(), 0);
    }

    @Test
    public void bowlCreationWithArgsCreatesBowlWithSpecifiedNumberOfBalls()
    {
        final int INITIAL_BALLS = 1;
        BOWL = new Bowl(INITIAL_BALLS);

        Assert.assertEquals(BOWL.getStones(), INITIAL_BALLS);
    }

    @Test
    public void takeAllStonesFromEmptyBowlReturnsZero()
    {
        Assert.assertEquals(BOWL.takeAllStones(), 0);
    }
}
