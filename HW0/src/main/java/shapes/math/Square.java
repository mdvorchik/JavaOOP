package shapes.math;

import shapes.exceptions.NegativeSizeOfTheShapeParameterException;

public class Square extends AbstractShape {

    private double lengthOfSide;

    public Square(double lengthOfSide) throws NegativeSizeOfTheShapeParameterException {
        if (lengthOfSide < 0) {
            throw new NegativeSizeOfTheShapeParameterException();
        }
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public double computeArea() {
        super.area = lengthOfSide * lengthOfSide;
        return super.area;
    }
}
