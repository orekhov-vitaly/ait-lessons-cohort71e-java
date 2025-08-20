package homeworks.homework_33;

/*
Написать класс Кот.
Каждый кот должен обладать цветом, весом (дробным) и возрастом (целочисленным).
Написать класс Main, в методе main создать список из семи котов разных характеристик.
Вывести всех котов в консоль.
Написать функциональный интерфейс, задача которого - фильтровать котов.
Написать метод, который на вход принимает список котов и объект фильтра котов и выводит в консоль только тех котов, которые удовлетворяют условию фильтра.
Реализовать три фильтра для котов (по параметрам на Ваш выбор) - при помощи обычного класса, анонимного класса и лямбда-выражения.
Результат работы всех трёх фильтров вывести в консоль.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Белый", 4.3, 3));
        cats.add(new Cat("Рыжий", 5.0, 6));
        cats.add(new Cat("Коричневый", 3.5, 2));
        cats.add(new Cat("Черный", 3.8, 4));
        cats.add(new Cat("Белый", 7.0, 8));
        cats.add(new Cat("Серый", 6.3, 5));
        cats.add(new Cat("Красный", 6.3, 4));

        for (Cat cat : cats) {
            System.out.println(cat);
        }

        System.out.println();

        System.out.println("Коты, чей вес больше 5:");
        // Обычный класс
        CatUtils.printFilterCats(cats, new FilterByWeight());

        System.out.println("Коты младше 4 лет:");
        // Анонимный класс
        CatUtils.printFilterCats(cats, new Filter() {
            @Override
            public boolean filter(Cat cat) {
                return cat.getAge() < 4;
            }
        });

        System.out.println("Коты, чей цвет начинается на \"К\":");
        // Лямбда-выражение
        CatUtils.printFilterCats(cats, cat -> cat.getColor().startsWith("К"));
    }
}
