package edu.gwu.algorithms.dp;

/**
 * Calculates "usual" fibonannic sequences, such as
 * g(i) = g(i-1) + g(i-2)
 */
public class FibonacciDP {

    public long calculateValue(int n) {
        long[] dpValues = new long[n + 1];
        dpValues[1] = dpValues[2] = 1;
        for (int i = 3; i <= n; i++) {
            dpValues[i] = dpValues[i - 1] + dpValues[i - 2];
        }
        return dpValues[n];
    }

    public static void main(String[] args) {
        FibonacciDP dp = new FibonacciDP();
        int[] nValues = { 20, 30, 40, 50, 60 };
        for (int n : nValues) {
            System.out.println("value[" + n + "]: " + dp.calculateValue(n));
        }
    }
}
