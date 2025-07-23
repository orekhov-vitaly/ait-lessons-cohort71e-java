package homeworks.homework_16;

/*
Напишите программу, которая поможет пользователю рассчитать общую стоимость покупок.
Программа должна запрашивать у пользователя названия товаров, их цены и количество.
В конце она должна выводить итоговую стоимость каждой покупки и общую стоимость всех покупок,
используя конкатенацию строк.

Пример ввода:

Введите название первого товара: Яблоки
Введите цену первого товара: 100
Введите количество первого товара: 3
Введите название второго товара: Бананы
Введите цену второго товара: 80
Введите количество второго товара: 2
Ожидаемый вывод:

Общая стоимость Яблоки: 300.0 рублей
Общая стоимость Бананы: 160.0 рублей
Общая стоимость всех покупок: 460.0 рублей
*/

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название первого товара:");
        String nameProduct1 = scanner.nextLine();

        System.out.println("Введите цену первого товара:");
        double priceProduct1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Введите количество первого товара:");
        double countProduct1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Введите название второго товара:");
        String nameProduct2 = scanner.nextLine();

        System.out.println("Введите цену второго товара:");
        double priceProduct2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Введите количество второго товара:");
        double countProduct2 = scanner.nextDouble();
        scanner.nextLine();

        double totalPriceProduct1 = priceProduct1 * countProduct1;
        double totalPriceProduct2 = priceProduct2 * countProduct2;
        double totalPrice = totalPriceProduct1 + totalPriceProduct2;

        System.out.println("Общая стоимость " + nameProduct1 + ": " + totalPriceProduct1 + " рублей");
        System.out.println("Общая стоимость " + nameProduct2 + ": " + totalPriceProduct2 + " рублей");
        System.out.println("Общая стоимость всех покупок: " + totalPrice + " рублей");
    }
}
