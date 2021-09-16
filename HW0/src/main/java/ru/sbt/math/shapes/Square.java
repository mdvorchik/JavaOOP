package ru.sbt.math.shapes;

public class Square implements AreaComputable {

    private final double lengthOfSide;

    public Square(double lengthOfSide) throws IllegalArgumentException {
        if (lengthOfSide < 0) {
            throw new IllegalArgumentException();
        }
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public double computeArea() {
        return lengthOfSide * lengthOfSide;
    }
}
