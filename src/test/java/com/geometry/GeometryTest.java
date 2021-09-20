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



}

