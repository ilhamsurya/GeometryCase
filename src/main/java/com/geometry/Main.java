package com.geometry;
import java.util.Scanner;

public class Main {
    public static void main(String arg[]){
        System.out.println("test");
        Point point = new Point(3,2);
        Point pointb = new Point(-2, -5);
        Line line = new Line(point, pointb);
        line.calculateLength();

    }
}

