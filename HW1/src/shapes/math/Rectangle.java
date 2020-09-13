package shapes.math;

public class Rectangle extends AbstractShape {

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double computeArea() {
        super.area = length * width;
        return super.area;
    }
}

