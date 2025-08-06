package lessons.lesson_27.task_05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 3, 12};
        int[][] numbers2d = {
                {2, 5, 6},
                {11, 23, 1},
                {2, 3, 4}
        };

        int[] cloneNumbers = numbers.clone(); // клонирование одномерного массива
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(cloneNumbers));
        System.out.println("=====");

        cloneNumbers[1] = 10;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(cloneNumbers));
        System.out.println("=====");

        int[][] cloneNumbers2d = numbers2d.clone();
        printArray(numbers2d);
        printArray(cloneNumbers2d);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.print("{");
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.print("}");
            System.out.println();
        }
    }
}
