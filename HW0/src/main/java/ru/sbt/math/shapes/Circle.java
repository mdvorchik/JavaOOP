package ru.sbt.math.shapes;

public class Circle implements AreaComputable {

    private final double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return radius * radius * Math.PI;
    }
}