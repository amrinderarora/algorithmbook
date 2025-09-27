import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class ConvexHullTest {
    public static void main (String[] args) {
        if (args.length < 1) { 
            System.out.println("Usage: java ConvexHullTest <n>"); 
            return; 
        }
        
        int n = Integer.parseInt(args[0]); 
        Random rand = new Random(); 
        // Generate n random points 
        List<Point> points = new ArrayList<>(); 
        for (int i = 0; i < n; i++) { 
            double x = rand.nextDouble() * 100; 
            // range 0..100 
            double y = rand.nextDouble() * 100; 
            points.add(new Point(x, y)); 
            
        } 
        System.out.println("Generated Points:"); 

        // Run the D&C algorithm
        ConvexHull ch = new ConvexHull();
        List<Point> hull = ch.divideAndConquer(points);
        System.out.println("\nConvex Hull Points (in order):"); 
        int counter = 0;
        for (Point p : hull) { 
            System.out.println(p); 
            // Only print first 100
            if (counter++ > 100) {
                break;
            }
        }
    }
}
 
