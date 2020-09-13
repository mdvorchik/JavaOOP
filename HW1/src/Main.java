import shapes.math.Circle;
import shapes.math.Rectangle;
import shapes.math.Square;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2, 3);
        Square sq = new Square(5);
        Circle circle = new Circle(2);

        System.out.println(rect.computeArea());
        System.out.println(sq.computeArea());
        System.out.println(circle.computeArea());
    }
}
