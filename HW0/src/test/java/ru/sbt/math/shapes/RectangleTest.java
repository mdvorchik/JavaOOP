package ru.sbt.math.shapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test(expected = IllegalArgumentException.class)
    public void circleConstructorWithFirstIllegalArgument() throws IllegalArgumentException {
        new Rectangle(-1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void circleConstructorWithSecondIllegalArgument() throws IllegalArgumentException {
        new Rectangle(1, -2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void circleConstructorWithIllegalArguments() throws IllegalArgumentException {
        new Rectangle(-1, -2);
    }

    @Test
    public void computeArea() throws IllegalArgumentException {
        //given
        double length = 5.;
        double width = 4.;
        AreaComputable circle = new Rectangle(length, width);
        double expectedArea = 20.;
        //when
        double actualArea = circle.computeArea();
        //verify
        assertEquals(expectedArea, actualArea, 0.001);
    }
}