package homeworks.homework_24;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(25.8);
        System.out.println(circle1.toString());
        System.out.println("Площадь круга: " + circle1.getArea());
        System.out.println("==========\n");

        Square square1 = new Square(25.8);
        System.out.println(square1.toString());
        System.out.println("Площадь квадрата: " + square1.getArea());
        System.out.println("==========\n");

        Rectangle rectangle1 = new Rectangle(25.8, 51.6);
        System.out.println(rectangle1.toString());
        System.out.println("Площадь прямоугольника: " + rectangle1.getArea());
        System.out.println("==========\n");
    }
}
