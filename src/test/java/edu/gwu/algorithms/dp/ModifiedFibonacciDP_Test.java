package edu.gwu.algorithms.dp;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class ModifiedFibonacciDP_Test {

    private ModifiedFibonacciDP mvcsBf = new ModifiedFibonacciDP();

    @Test
    public void testAll() {
        Map<Integer, Long> testCases = new HashMap<>();
        testCases.put(20, 316L);
        for (int tc : testCases.keySet()) {
            Assert.assertEquals(mvcsBf.calculateValue(tc), testCases.get(tc).longValue());
        }
    }
}
