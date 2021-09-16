package ru.sbt.math.shapes;

public class Rectangle implements AreaComputable {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException();
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public double computeArea() {
        return length * width;
    }
}

