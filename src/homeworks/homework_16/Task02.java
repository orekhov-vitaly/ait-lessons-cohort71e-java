package homeworks.homework_16;

/*
Исходные данные: есть длина и ширина погрузочного пространства корабля,
а также длина и ширина морского контейнера.
Напишите программу, которая запрашивает эти данные у пользователя,
сохраняет эти данные в переменных, вычисляет и выводит в консоль,
сколько контейнеров может перевезти корабль.
*/

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите длину погрузочного пространства корабля:");
        int loadingSpaceLength = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Укажите ширину погрузочного пространства корабля:");
        int loadingSpaceWidth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Укажите длину морского контейнера:");
        int containerLength = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Укажите ширину морского контейнера:");
        int containerWidth = scanner.nextInt();
        scanner.nextLine();

        int countContainersInLength = loadingSpaceLength / containerLength;
        int countContainersInWidth = loadingSpaceWidth / containerWidth;

        int countContainers = countContainersInLength * countContainersInWidth;

        System.out.println("Количество контейнеров, которое может перевезти корабль: " + countContainers);
    }
}
