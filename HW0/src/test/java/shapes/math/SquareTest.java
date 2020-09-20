package shapes.math;

import org.junit.Assert;
import org.junit.Test;
import shapes.exceptions.NegativeSizeOfTheShapeParameterException;
import shapes.math.Square;

import static org.junit.Assert.*;

public class SquareTest {

    @Test(expected = NegativeSizeOfTheShapeParameterException.class)
    public void circleConstructor() throws NegativeSizeOfTheShapeParameterException {
        Square square = new Square(-1);
        square.computeArea();
    }

    @Test
    public void computeArea() throws NegativeSizeOfTheShapeParameterException {
        for (int i = 0; i < 1000; ++i) {
            double testData = Math.random() * 1000.;
            double delta = 0.001;
            Square square = new Square(testData);
            Assert.assertEquals(testData*testData, square.computeArea(), delta);
        }
    }
}