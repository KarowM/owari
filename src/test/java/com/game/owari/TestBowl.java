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
        Assert.assertEquals(BOWL.getStones(), 0);
    }

    @Test
    public void bowlCreationWithArgsCreatesBowlWithSpecifiedNumberOfBalls()
    {
        BOWL = new Bowl(ONE);

        Assert.assertEquals(BOWL.getStones(), ONE);
    }

    @Test
    public void takeAllStonesFromEmptyBowlReturnsZero()
    {
        Assert.assertEquals(BOWL.takeAllStones(), 0);
    }

    @Test
    public void takeAllStonesFromNonEmptyBowlReturnsNumberOfBallsInBowl()
    {
        BOWL = new Bowl(ONE);

        Assert.assertEquals(BOWL.takeAllStones(), ONE);
    }

    @Test
    public void depositZeroStoneDoesNotUpdateBallsInBowl()
    {
        int ballsBefore = BOWL.getStones();
        BOWL.depositStone(ZERO);

        Assert.assertEquals(BOWL.getStones(), ballsBefore);
    }

    @Test
    public void depositNonZeroStoneDoesNotUpdateBallsInBowl()
    {
        int ballsBefore = BOWL.getStones();
        BOWL.depositStone(ONE);

        Assert.assertEquals(BOWL.getStones(), ballsBefore);
    }

    @Test
    public void updateAndGetStoreReturnsZeroFromEmptyBowl()
    {
        Assert.assertEquals(BOWL.updateAndGetScore(), ZERO);
    }

    @Test
    public void depositZeroThenUpdateAndGetStoreReturnsZero()
    {
        BOWL.depositStone(ZERO);

        Assert.assertEquals(BOWL.updateAndGetScore(), ZERO);
    }
}
