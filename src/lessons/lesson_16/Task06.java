package lessons.lesson_16;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();
        // scanner.nextLine();
        System.out.println("Ваше число - " + number);

        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        System.out.println("Вы ввели - " + str);
    }
}
