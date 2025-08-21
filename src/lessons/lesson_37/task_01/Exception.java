package lessons.lesson_37.task_01;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        // Запросить у пользователя имя и возраст и вывести информацию пользователя на экран
        System.out.println("Start");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Ваше имя:");
        String name = scanner.nextLine();

        System.out.println("Имя пользователя успешно прочитано");

        System.out.println("Введите Ваш возраст:");
        String stringAge = scanner.nextLine();

        System.out.println("Возраст пользователя успешно прочитано");

        try {
            int age = Integer.parseInt(stringAge);
            System.out.println("Возраст успешно преобразован в число");
            System.out.println("Ваше имя: " + name);
            System.out.println("Ваш возраст: " + stringAge);
            System.out.println("Блок try успешно завершил работу");
        } catch (NumberFormatException e) {
            System.out.println("Начало работы блока catch");
            System.out.println("Сообщение об ошибке: " + e.getMessage());
            e.printStackTrace();
            System.out.println("Ошибка! Вы ввели некорректные данные");
            System.out.println("Блок catch завершил работу");
        }

        System.out.println("Программа успешно завершена");
    }
}
