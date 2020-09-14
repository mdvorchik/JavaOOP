package shapes.math;

import shapes.exceptions.NegativeSizeOfTheShapeParameterException;

public class Rectangle extends AbstractShape {

    private double length;
    private double width;

    public Rectangle(double length, double width) throws NegativeSizeOfTheShapeParameterException {
        if (length < 0 || width < 0) {
            throw new NegativeSizeOfTheShapeParameterException();
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public double computeArea() {
        super.area = length * width;
        return super.area;
    }
}

