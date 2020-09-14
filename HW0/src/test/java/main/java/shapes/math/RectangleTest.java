package main.java.shapes.math;

import org.junit.Assert;
import org.junit.Test;
import shapes.exceptions.NegativeSizeOfTheShapeParameterException;
import shapes.math.Rectangle;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test(expected = NegativeSizeOfTheShapeParameterException.class)
    public void circleConstructor1() throws NegativeSizeOfTheShapeParameterException {
        Rectangle rect = new Rectangle(-1, 2);
        rect.computeArea();
    }

    @Test(expected = NegativeSizeOfTheShapeParameterException.class)
    public void circleConstructor2() throws NegativeSizeOfTheShapeParameterException {
        Rectangle rect = new Rectangle(1, -2);
        rect.computeArea();
    }

    @Test(expected = NegativeSizeOfTheShapeParameterException.class)
    public void circleConstructor3() throws NegativeSizeOfTheShapeParameterException {
        Rectangle rect = new Rectangle(-1, -2);
        rect.computeArea();
    }

    @Test
    public void computeArea() throws NegativeSizeOfTheShapeParameterException {
        for (int i = 0; i < 1000; ++i) {
            double testData1 = Math.random() * 1000.;
            double testData2 = Math.random() * 1000.;
            double delta = 0.001;
            Rectangle rect = new Rectangle(testData1, testData2);
            Assert.assertEquals(testData1*testData2, rect.computeArea(), delta);
        }
    }
}