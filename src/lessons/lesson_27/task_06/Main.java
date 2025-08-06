package lessons.lesson_27.task_06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] numbers2d = {
                {2, 5, 6},
                {11, 23, 1},
                {2, 3, 4}
        };

        int[][] cloneNumbers2d = copyArray(numbers2d);

        printArray(numbers2d);
        System.out.println();
        printArray(cloneNumbers2d);
        System.out.println();

        cloneNumbers2d[0][0] = 150;

        printArray(numbers2d);
        System.out.println();
        printArray(cloneNumbers2d);
    }

    public static int[][] copyArray(int[][] array) {
        int[][] result = new int[array.length][];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i].clone();
        }
        return result;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.print("{ ");
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.print("}");
            System.out.println();
        }
    }
}
