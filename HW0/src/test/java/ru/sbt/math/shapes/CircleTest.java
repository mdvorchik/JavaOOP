package ru.sbt.math.shapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test(expected = IllegalArgumentException.class)
    public void circleConstructorWithIllegalArgument() {
        new Circle(-1);
    }

    @Test
    public void computeArea() {
        //given
        double radius = 75.;
        AreaComputable circle = new Circle(radius);
        double expectedArea = Math.pow(radius, 2) * Math.PI;
        //when
        double actualArea = circle.computeArea();
        //verify
        assertEquals(expectedArea, actualArea, 0.001);
    }
}