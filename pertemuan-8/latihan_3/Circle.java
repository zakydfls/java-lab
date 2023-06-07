package latihan_3;

public class Circle extends Shape {
    double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        double area, phi;
        area = 0;
        phi = 3.14;
        area = phi * radius * radius;
        return area;
    }

    double getPerimeter() {
        double perimeter, phi;
        perimeter = 0;
        phi = 3.14;
        perimeter = 2 * phi * radius;
        return perimeter;

    }

}
