package lessons.lesson_17;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        String numberAsString = scanner.nextLine();
        int number = Integer.parseInt(numberAsString);
        System.out.println("Ваше число - " + number);

        System.out.println("Введите строку:");
        String phrase = scanner.nextLine();
        System.out.println("Вы ввели - " + phrase);
    }
}