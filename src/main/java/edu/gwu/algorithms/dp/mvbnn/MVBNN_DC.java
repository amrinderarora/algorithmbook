package edu.gwu.algorithms.dp.mvbnn;

/**
 * Divide and Conquer version of the Maximum Value but No Neighbors
 */
public class MVBNN_DC {

    public long calculateValue(int n) {
        if (n <= 2) {
            return 1;
        }
        return calculateValue(n - 1) + calculateValue(n - 2);
    }

    public static void main(String[] args) {
        MVBNN_DC dc = new MVBNN_DC();
        int[] nValues = { 20, 30, 40, 50, 55, 60 };
        for (int n: nValues) {
            System.out.println("value[" + n + "]: " + dc.calculateValue(n));
        }
    }

}
