package edu.gwu.algorithms.dp;

/**
 * Calculates "random" fibonannic sequences, such as
 * g(i) = 2 g(i-1) + 3 g(i-5) + 5 g(i-9).
 */
public class FibonacciDC {


    public long calculateValue(int n) {
        if (n <= 2) {
            return 1;
        }
        return calculateValue(n - 1) + calculateValue(n - 2);
    }

    public static void main(String[] args) {
        FibonacciDC dc = new FibonacciDC();
        int[] nValues = { 20, 30, 40, 50, 55, 60 };
        for (int n: nValues) {
            System.out.println("value[" + n + "]: " + dc.calculateValue(n));
        }
    }

}
