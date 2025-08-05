package homeworks.homework_24;

/*
1. Создайте четыре класса - Фигура, Круг, Квадрат, Прямоугольник.
2. У круга должен быть радиус. У квадрата должна быть длина стороны. У прямоугольника должны быть длины двух сторон.
3. У каждой фигуры должны быть методы, которые вычисляют и возвращают их периметр и площадь.
4. Подумайте, как правильно реализовать иерархию наследования и применить абстракцию.
*/

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(25.8);
        System.out.println(circle1.toString());
        System.out.println("Площадь круга: " + circle1.getArea());
        System.out.println("Периметр круга: " + circle1.getPerimetr());
        System.out.println("==========\n");

        Square square1 = new Square(25.8);
        System.out.println(square1.toString());
        System.out.println("Площадь квадрата: " + square1.getArea());
        System.out.println("Периметр квадрата: " + square1.getPerimetr());
        System.out.println("==========\n");

        Rectangle rectangle1 = new Rectangle(25.8, 51.6);
        System.out.println(rectangle1.toString());
        System.out.println("Площадь прямоугольника: " + rectangle1.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle1.getPerimetr());
        System.out.println("==========\n");
    }
}
