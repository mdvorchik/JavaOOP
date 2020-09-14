package main.java.shapes.math;

import org.junit.Assert;
import org.junit.Test;
import shapes.exceptions.NegativeSizeOfTheShapeParameterException;
import shapes.math.Circle;

import static org.junit.Assert.*;

public class CircleTest {

    @Test(expected = NegativeSizeOfTheShapeParameterException.class)
    public void circleConstructor() throws NegativeSizeOfTheShapeParameterException {
        Circle circle = new Circle(-1);
        circle.computeArea();
    }

    @Test
    public void computeArea() throws NegativeSizeOfTheShapeParameterException {
        for (int i = 0; i < 1000; ++i) {
            double testData = Math.random() * 1000.;
            double delta = 0.001;
            Circle circle = new Circle(testData);
            Assert.assertEquals(testData*testData*Math.PI, circle.computeArea(), delta);
        }
    }
}