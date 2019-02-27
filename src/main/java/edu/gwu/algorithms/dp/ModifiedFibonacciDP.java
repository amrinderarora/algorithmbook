package edu.gwu.algorithms.dp;

/**
 * Calculates "random" fibonannic sequences, such as
 * g(i) = 2 g(i-1) + 3 g(i-5) + 5 g(i-9).
 */
public class ModifiedFibonacciDP {


    public long calculateValue(int n) {
        long[] dpValues = new long[n + 1];
        for (int i = 0; i <= 10; i++) {
            dpValues[i] = 1;
        }
        for (int i = 11; i <= n; i++) {
            dpValues[i] = 2 * dpValues[i - 3] + 3 * dpValues[i - 5] + 5 * dpValues[i - 9];
        }
        return dpValues[n];
    }

    public static void main(String[] args) {
        ModifiedFibonacciDP dp = new ModifiedFibonacciDP();
        System.out.println("value[20]: " + dp.calculateValue(20));
        System.out.println("value[40]: " + dp.calculateValue(40));
    }
}
