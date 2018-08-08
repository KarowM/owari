package com.game.owari;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBowl {

    private static Bowl BOWL;
    public static final int INITIAL_BALLS = 1;

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
        BOWL = new Bowl(INITIAL_BALLS);

        Assert.assertEquals(BOWL.getStones(), INITIAL_BALLS);
    }

    @Test
    public void takeAllStonesFromEmptyBowlReturnsZero()
    {
        Assert.assertEquals(BOWL.takeAllStones(), 0);
    }

    @Test
    public void takeAllStonesFromNonEmptyBowlReturnsNumberOfBallsInBowl()
    {
        BOWL = new Bowl(INITIAL_BALLS);

        Assert.assertEquals(BOWL.takeAllStones(), INITIAL_BALLS);
    }
}
