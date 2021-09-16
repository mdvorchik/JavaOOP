package ru.sbt.math.shapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test(expected = IllegalArgumentException.class)
    public void circleConstructorWithIllegalArgument() {
        new Square(-1);
    }

    @Test
    public void computeArea() {
        //given
        double length = 5.;
        AreaComputable circle = new Square(length);
        double expectedArea = 25.;
        //when
        double actualArea = circle.computeArea();
        //verify
        assertEquals(expectedArea, actualArea, 0.001);
    }
}