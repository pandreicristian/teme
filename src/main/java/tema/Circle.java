package tema;

public class Circle extends AShape {

    private static final double PI=3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI*radius*radius;
    }

    public double getPerimeter() {
        return 2*PI*radius;
    }
}
