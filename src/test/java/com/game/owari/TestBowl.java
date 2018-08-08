package com.game.owari;

import org.junit.Assert;
import org.junit.Test;

public class TestBowl {

    private static Bowl BOWL;

    @Test
    public void bowlCreationWithNoArgsCreatesEmptyBowl()
    {
        BOWL = new Bowl();

        Assert.assertEquals(BOWL.getStones(), 0);
    }
}
