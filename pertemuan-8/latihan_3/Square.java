package latihan_3;

public class Square extends Rectangle {
    Square() {
    }

    Square(double side) {
        this.length = side;
        this.width = side;
    }

    Square(double side, String color, boolean filled) {
        // ----
        this.length = side;
        this.width = side;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double side) {
        super.setLength(length);
    }
}
