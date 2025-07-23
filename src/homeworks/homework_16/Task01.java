package homeworks.homework_16;

/* Исходные данные: есть количество рядов сидений в салоне самолёта, количество сидений в каждом ряду,
а также количество пассажиров, которые купили билет на этот самолёт.
Напишите программу, которая запрашивает эти данные у пользователя, сохраняет эти данные в переменных,
вычисляет и выводит в консоль, сколько свободных мест осталось в самолёте.
*/

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите количество рядов сидений в салоне самолёта:");
        int countRows = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Укажите количество сидений в каждом ряду:");
        int countSeatsInRow = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Укажите количество пассажиров, которые купили билет на этот самолёт:");
        int countTicketsSold = scanner.nextInt();
        scanner.nextLine();

        int countTotalSeats = countRows * countSeatsInRow;
        int countAvailableSeats = countTotalSeats - countTicketsSold;

        System.out.println("В самолёте осталось свободных мест: " + countAvailableSeats);
    }
}
