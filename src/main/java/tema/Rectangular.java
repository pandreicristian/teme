package tema;

public class Rectangular extends AShape {

    private double bigSide,smallSide;

    public double getBigSide() {
        return bigSide;
    }

    public double getSmallSide() {
        return smallSide;
    }

    public Rectangular(double bigSide, double smallSide) {
        this.bigSide = bigSide;
        this.smallSide = smallSide;
    }

    public double getArea() {
        return bigSide*smallSide;
    }

    public double getPerimeter() {
        return 2*bigSide+2*smallSide;
    }
}
