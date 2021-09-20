package com.geometry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeometryTest {
    @Test
    public void shouldAssignPoint(){
        Point point = new Point(0,5);
        assertEquals(0, point.x);
        assertEquals(5,point.y);
    }

    @Test
    public void calculateLength(){
        Point point1 = new Point(0, 0);
        Point point2 = new Point(5, 0);
        Line line = new Line(point1, point2);
        assertEquals(5, line.calculateLength());
    }

}

