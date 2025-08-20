package lessons.lesson_36.task_02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Исходный массив");
        for (int[] row : numbers) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        /*
        Task 1.
        Преобразовать двумерный массив в одномерный
         */
        // Способ 1. Написать отдельный метод, который выполнит данное преобразование
        int[] result = generateSimpleArrayFrom2d(numbers);
        System.out.println("Одномерный массив");
        System.out.println(Arrays.toString(result));

        // Способ 2. Использование Stream
        int[] result1 = Arrays
                .stream(numbers)
                .flatMapToInt(x -> Arrays.stream(x))
                .toArray();
        System.out.println("Одномерный массив");
        System.out.println(Arrays.toString(result1));

    }

    public static int[] generateSimpleArrayFrom2d (int[][] array) {
        int arraySize = 0;
        for (int[] row : array) {
            arraySize += row.length;
        }
        int[] result = new int[arraySize];

        int index = 0;
        for (int[] row : array) {
            for (int cell : row) {
                result[index++] = cell;
            }
        }
        return result;
    }
}
