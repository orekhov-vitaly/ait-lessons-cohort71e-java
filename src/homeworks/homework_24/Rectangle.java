package homeworks.homework_24;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Ширина должна быть положительной!");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {

        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Длина должна быть положительной!");
        }
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimetr() {
        return width * 2 + length * 2;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "width=" + width +
                ", length=" + length;
    }
}
