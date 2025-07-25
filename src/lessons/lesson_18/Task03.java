package lessons.lesson_18;

// Задача: пользователь вводит название своего домашнего животного.
// Если это кошка, вывести на экран - "Отлично! Вы счастливый обладатель кошки".
// Если это собака, вывести на экран - "Поздравляем! У вас есть собака".
// Если пользователь введёт какое-то другое животное, вывести -
// "У вас какое-то другое животное".

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название своего домашнего животного:");
        String pet = scanner.nextLine();

        if (pet.equals("кошка")) {
            System.out.println("Отлично! Вы счастливый обладатель кошки");
        } else if (pet.equals("собака")) {
            System.out.println("Поздравляем! У вас есть собака");
        } else {
            System.out.println("У вас какое-то другое животное");
        }

        switch (pet) {
            case "кошка":
                System.out.println("Отлично! Вы счастливый обладатель кошки");
                break;
            case "собака":
                System.out.println("Поздравляем! У вас есть собака");
                break;
            default:
                System.out.println("У вас какое-то другое животное");
        }
    }
}
