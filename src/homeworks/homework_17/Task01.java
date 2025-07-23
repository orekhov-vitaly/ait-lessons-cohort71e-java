package homeworks.homework_17;

/*
Напишите программу, которая запрашивает у пользователя число.
Если введённое число делится нацело на три, вывести на экран – «Ваше число делится на три».
Если нет – вывести на экран – «Ваше число не делится на три».
*/

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number % 3 == 0) {
            System.out.println("Ваше число делится на три");
        } else {
            System.out.println("Ваше число не делится на три");
        }
    }
}
