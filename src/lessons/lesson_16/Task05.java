package lessons.lesson_16;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Ваше имя " + name);

        System.out.println("Введите число:");
        int number = scanner.nextInt();
        System.out.println("Вы ввели " + number);

        System.out.println("Введите дробное число:");
        double number1 = scanner.nextDouble();
        System.out.println("Вы ввели " + number1);

        System.out.println("Введите фразу:");
        String word = scanner.next();
        System.out.println("Первое слово в фразе - " + word);
    }
}
