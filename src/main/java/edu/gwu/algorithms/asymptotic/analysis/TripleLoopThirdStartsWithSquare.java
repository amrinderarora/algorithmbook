package edu.gwu.algorithms.asymptotic.analysis;

import edu.gwu.algorithms.asymptotic.TCObservation;
import edu.gwu.algorithms.asymptotic.TCReport;

/**
 * An asymptotic complexity analysis problem, where third loop
 * starts from second squared.
 * 
 * @author Amrinder Arora
 */
public class TripleLoopThirdStartsWithSquare {
    public int loopMethod(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = j * j; k < n; k++) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        TripleLoopThirdStartsWithSquare tl = new TripleLoopThirdStartsWithSquare();
        // Runs problem instances
        int[] instanceSizes = { 10000, 20000, 30000, 40000, 50000, 60000 };
        TCReport tcReport = new TCReport();
        for (int instanceSize : instanceSizes) {
            long t1 = System.nanoTime();
            tl.loopMethod(instanceSize);
            long timeElapsed = System.nanoTime() - t1;
            tcReport.add(new TCObservation(instanceSize, timeElapsed));
        }
        
        System.out.println("tcReport: " + tcReport.prettyPrint());

    }
}
