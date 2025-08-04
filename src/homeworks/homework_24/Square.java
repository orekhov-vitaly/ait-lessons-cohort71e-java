package homeworks.homework_24;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        } else {
            System.out.println("Сторона квадрата должна быть положительной!");
        }
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square: " +
                "side=" + side;
    }
}
