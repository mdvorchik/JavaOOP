package shapes.math;

import shapes.exceptions.NegativeSizeOfTheShapeParameterException;

public class Circle extends AbstractShape {

    private double radius;

    public Circle(double radius) throws NegativeSizeOfTheShapeParameterException {
        if (radius < 0) {
            throw new NegativeSizeOfTheShapeParameterException();
        }
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        super.area = radius * radius * Math.PI;
        return super.area;
    }
}