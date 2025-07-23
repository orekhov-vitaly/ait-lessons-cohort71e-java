package homeworks.homework_17;

/*
Напишите программу, которая запрашивает у пользователя три числа.
Выведите на экран фразу "Сумма трёх чисел положительная и чётная", если это так.
Для всех остальных случаев нужно просто выводить сумму трёх чисел на экран.
*/

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите третье число:");
        int number3 = scanner.nextInt();
        scanner.nextLine();

        int sum = number1 + number2 + number3;

        if (sum > 0 && sum % 2 == 0) {
            System.out.println("Сумма трёх чисел положительная и чётная");
        } else {
            System.out.println(sum);
        }
    }
}
