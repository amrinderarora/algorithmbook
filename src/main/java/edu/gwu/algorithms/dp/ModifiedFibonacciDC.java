package edu.gwu.algorithms.dp;

/**
 * Calculates "random" fibonannic sequences, such as
 * g(i) = 2 g(i-1) + 3 g(i-5) + 5 g(i-9).
 */
public class ModifiedFibonacciDC {


    public long calculateValue(int n) {
        if (n <= 10) {
            return 1;
        }
        return 2 * calculateValue(n - 3) + 3 * calculateValue(n - 5) + 5 * calculateValue(n - 9);
    }
}
