package homeworks.homework_18;

/*
Напишите программу, которая выводит в консоль название месяца (на английском языке),
ориентируясь на значение, которое ввёл пользователь,
например, пользователь ввёл 12 - программа отобразила сообщение "December".
Если пользователь ввёл неккоректное значение (больше 12), отобразите в консоли соответствующее сообщение
*/

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите порядковый номер месяца:");
        int monthNumber = scanner.nextInt();
        scanner.nextLine();

        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Некорректное значение");
        }
    }
}
