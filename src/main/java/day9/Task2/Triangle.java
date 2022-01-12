package day9.Task2;

public class Triangle extends Figure{

    private double leg1;
    private double leg2;
    private double leg3;

    public Triangle(double leg1, double leg2, double leg3, String color) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.leg3 = leg3;
    }

    @Override
    public double area() {
        double p = (leg1 + leg2 + leg3) / 2;
        double area = Math.sqrt(p * (p - leg1) * (p - leg2) * (p - leg3));
        return area;
    }

    @Override
    public double perimeter() {
        return leg1 + leg2 + leg3;
    }
}
