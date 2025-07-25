package homeworks.homework_18;

/*
Представьте, что пользователь придумывает себе пароль при регистрации.
Правильный пароль должен быть не менее 8 символов в длину.
Напишите программу, которая запрашивает пароль у пользователя.
Причём попытки ввода должны повторяться до тех пор, пока пользователь не введёт корректный пароль.
*/

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "";
        while (password.length() <= 8) {
            System.out.println("Придумайте пароль не менее 8 символов:");
            password = scanner.nextLine();
        }

        System.out.println("Пароль успешно создан!");
    }
}
