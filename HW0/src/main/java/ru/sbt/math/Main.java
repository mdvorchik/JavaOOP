package ru.sbt.math;

import ru.sbt.math.shapes.Circle;
import ru.sbt.math.shapes.Rectangle;
import ru.sbt.math.shapes.Square;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        Rectangle rect = new Rectangle(2, 3);
        Square sq = new Square(5);
        Circle circle = new Circle(2);

        System.out.println(rect.computeArea());
        System.out.println(sq.computeArea());
        System.out.println(circle.computeArea());
    }
}
