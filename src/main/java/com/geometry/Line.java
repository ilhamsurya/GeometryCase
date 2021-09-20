package com.geometry;

public class Line {
    private Point pointA;
    private Point pointB;

    public Line(Point a, Point b){
        pointA = a;
        pointB = b;
    }

    public int calculateLength(){
        int x,y;
        int x1 = pointA.x;
        int y1 = pointA.y;
        int x2 = pointB.x;
        int y2 = pointB.y;

        x = x2-x1;
        y = y2-y1;
        int distance = (int) Math.sqrt(x*x + y*y);
        System.out.println("Distance between them = " + distance);
        return distance;
    }
}
