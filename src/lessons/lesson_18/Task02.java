package lessons.lesson_18;

/* Задача
Пользователь вводит число
Если число равно 1 - вывести фразу "Ваше число равно еденице"
Если число равно 2 - вывести фразу "Ваше число равно двойке"
Если число равно 3 или 4 - вывести фразу "Ваше число равно тройке или четверке"
Если число равно 5 - вывести фразу "Ваше число равно пятёрки"
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 1 до 5:");
        int number = scanner.nextInt();
        scanner.nextLine();

        switch (number) {
            case 1:
                System.out.println("Ваше число равно единице");
                break;
            case 2:
                System.out.println("Ваше число равно двойке");
                break;
            case 3:
            case 4:
                System.out.println("Ваше число равно тройке или четверке");
                break;
            case 5:
                System.out.println("Ваше число равно пятёрки");
                break;
        }
    }
}
