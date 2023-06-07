package latihan_3;

public class Rectangle extends Shape {
    double width = 1.0, length = 1.0;

    Rectangle() {
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double area;
        area = 0;
        area = width * length;
        return area;
    }

    public double getPerimeter() {
        double area;
        area = 0;
        area = (width + length) * 2;
        return area;
    }
}
