package Models;

public class Circle {
    public Circle(double radius) {
        this.radius = radius;
    }

    public double radius;

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void PrettyPrint() {
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", area());
        System.out.printf("Circumference: %.2f%n", circumference());
    }
}
