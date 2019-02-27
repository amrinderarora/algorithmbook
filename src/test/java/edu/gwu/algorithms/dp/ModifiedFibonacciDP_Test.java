package edu.gwu.algorithms.dp;

import org.junit.Assert;
import org.junit.Test;

public class ModifiedFibonacciDP_Test {

    private ModifiedFibonacciDP mvcsBf = new ModifiedFibonacciDP();

    @Test
    public void testAll() {
        Assert.assertEquals(mvcsBf.calculateValue(20), 316);
    }
}
