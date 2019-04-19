package edu.gwu.algorithms.dp;

/**
 * Calculates "random" fibonannic sequences, such as
 * g(i) = 2 g(i-1) + 3 g(i-5) + 5 g(i-9).
 */
public class ModifiedFibonacciDC {


    public long calculateValue(int n) {
        // System.out.println("Calculating for " + n);
        if (n <= 10) {
            return 1;
        }
        return 2 * calculateValue(n - 3) + 3 * calculateValue(n - 5) + 5 * calculateValue(n - 9);
    }

    public static void main(String[] args) {
        ModifiedFibonacciDC dc = new ModifiedFibonacciDC();
        System.err.println("value[20]: " + dc.calculateValue(20));
        System.err.println("value[90]: " + dc.calculateValue(90));
        System.err.println("value[95]: " + dc.calculateValue(95));
        System.err.println("value[92]: " + dc.calculateValue(92));
    }

}
