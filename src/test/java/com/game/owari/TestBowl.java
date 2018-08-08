package com.game.owari;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBowl {

    public static final int ZERO = 0;
    public static final int ONE = 1;

    private static Bowl BOWL;

    @Before
    public void setup()
    {
        BOWL = new Bowl();
    }

    @Test
    public void bowlCreationWithNoArgsCreatesEmptyBowl()
    {
        Assert.assertEquals(ZERO, BOWL.getStones());
    }

    @Test
    public void bowlCreationWithArgsCreatesBowlWithSpecifiedNumberOfBalls()
    {
        BOWL = new Bowl(ONE);

        Assert.assertEquals(ONE, BOWL.getStones());
    }

    @Test
    public void takeAllStonesFromEmptyBowlReturnsZero()
    {
        Assert.assertEquals(ZERO, BOWL.takeAllStones());
    }

    @Test
    public void takeAllStonesFromNonEmptyBowlReturnsNumberOfBallsInBowl()
    {
        BOWL = new Bowl(ONE);

        Assert.assertEquals(ONE, BOWL.takeAllStones());
    }

    @Test
    public void depositZeroStoneDoesNotUpdateBallsInBowl()
    {
        int ballsBefore = BOWL.getStones();
        BOWL.depositStone();

        Assert.assertEquals(ballsBefore, BOWL.getStones());
    }

    @Test
    public void depositNonZeroStoneDoesNotUpdateBallsInBowl()
    {
        int ballsBefore = BOWL.getStones();
        BOWL.depositStone();

        Assert.assertEquals(ballsBefore, BOWL.getStones());
    }

    @Test
    public void updateAndGetStoreReturnsZeroFromEmptyBowl()
    {
        Assert.assertEquals(ZERO, BOWL.updateAndGetScore());
    }


    @Test
    public void depositStoneInEmptyBowlThenUpdateAndGetScoreReturnsZero()
    {
        BOWL.depositStone();

        Assert.assertEquals(ZERO, BOWL.updateAndGetScore());
    }

    @Test
    public void depositStoneInBowlWithTwoStonesThenUpdateAndGetScoreReturnsZero()
    {
        BOWL = new Bowl(2);
        BOWL.depositStone();

        Assert.assertEquals(ZERO, BOWL.updateAndGetScore());
    }

    @Test
    public void depositStoneOnceInBowlWithOneStoneThenUpdateAndGetScoreReturnsOne()
    {
        BOWL = new Bowl(ONE);
        BOWL.depositStone();

        Assert.assertEquals(ONE, BOWL.updateAndGetScore());
    }

    @Test
    public void depositStoneThriceInBowlWithOneStoneThenUpdateAndGetScoreReturnsThree()
    {
        BOWL = new Bowl(ONE);
        BOWL.depositStone();
        BOWL.depositStone();
        BOWL.depositStone();

        Assert.assertEquals(3, BOWL.updateAndGetScore());
    }
}
