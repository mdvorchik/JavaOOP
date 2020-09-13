package shapes.math;

public class Square extends AbstractShape {

    private double lengthOfSide;

    public Square(double lengthOfSide){
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public double computeArea() {
        super.area = lengthOfSide * lengthOfSide;
        return super.area;
    }
}
