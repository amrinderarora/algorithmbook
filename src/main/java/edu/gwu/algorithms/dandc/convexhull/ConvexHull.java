package edu.gwu.algorithms.dandc.convexhull;

import java.util.*;

public class ConvexHull {
    
    public List<Point> divideAndConquer(List<Point> points) {
        if (points.size() <= 3) {
            // base case: all points form the hull
            List<Point> hull = new ArrayList<>(points);
            // sort in CCW order
            hull.sort((a, b) -> Double.compare(a.x, b.x));
            return hull;
        }

        // Sort by x-coordinate
        points.sort(Comparator.comparingDouble(p -> p.x));
            
        int mid = points.size() / 2;
        List<Point> left = divideAndConquer(points.subList(0, mid));
        List<Point> right = divideAndConquer(points.subList(mid, points.size()));

        return merge(left, right);
    }

    // Merge two convex hulls into one
    private List<Point> merge(List<Point> left, List<Point> right) {
        // Graham scan merge approach
        List<Point> merged = new ArrayList<>();
        merged.addAll(left);
        merged.addAll(right);

        return grahamScan(merged);
    }

    // Graham scan helper (to clean up merged hull)
    private List<Point> grahamScan(List<Point> points) {
        if (points.size() <= 1) { 
            return points;
        }

        // Sort by x, then y
        points.sort((a, b) -> {
            if (a.x == b.x) 
                return Double.compare(a.y, b.y);
            return Double.compare(a.x, b.x);
        });

        List<Point> lower = new ArrayList<>();
        for (Point p : points) {
            while (lower.size() >= 2 && cross(lower.get(lower.size()-2), 
                                                  lower.get(lower.size()-1), p) <= 0) {
                lower.remove(lower.size()-1);
            }
            lower.add(p);
        }

        List<Point> upper = new ArrayList<>();
        for (int i = points.size() - 1; i >= 0; i--) {
            Point p = points.get(i);
            while (upper.size() >= 2 && cross(upper.get(upper.size()-2), 
                                                  upper.get(upper.size()-1), p) <= 0) {
                upper.remove(upper.size()-1);
            }
            upper.add(p);
        }

        // remove duplicate endpoints
        lower.remove(lower.size()-1);
        upper.remove(upper.size()-1);
        lower.addAll(upper);
        return lower;
    }

    // Cross product
    private double cross(Point a, Point b, Point c) {
        return (b.x - a.x) * (c.y - a.y) - 
                   (b.y - a.y) * (c.x - a.x);
    }
}
