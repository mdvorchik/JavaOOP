package shapes.math;

public class Circle extends AbstractShape {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        super.area = radius * radius * Math.PI;
        return super.area;
    }
}