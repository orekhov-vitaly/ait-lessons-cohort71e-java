package lessons.lesson_27.task_04;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[4]; // одномерный массив
        int[][] numbers = new int[4][3]; // двумерный массив

        array[0] = 10;

        numbers[0][0] = 1;

        System.out.println("array[0]: " + array[0]);
        System.out.println("numbers[0][0]: " + numbers[0][0]);

        System.out.println("\n==========\n");

        int[][] numbers2d = {
                {1, 5, 6},
                {4, 3, 8, 7},
                {9, 11},
        };

        int[][] numbers3 = new int[3][];
        numbers3[0] = new int[3];
        numbers3[1] = new int[4];
        numbers3[2] = new int[2];

        System.out.println("Количество строк (numbers2d.length): " + numbers2d.length);
        System.out.println("Длина первой строки (numbers2d[0].length): " + numbers2d[0].length);
        System.out.println("Длина второй строки (numbers2d[1].length): " + numbers2d[1].length);
        System.out.println("Длина третьей строки (numbers2d[2].length): " + numbers2d[2].length);
        System.out.println(Arrays.toString(numbers2d));

        for (int i = 0; i < numbers2d.length; i++) {
            System.out.print("{");
            for (int j = 0; j < numbers2d[i].length; j++) {
                System.out.print(numbers2d[i][j]);
                if(j != numbers2d[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            System.out.println();
        }

        for (int[] row : numbers2d) {
            System.out.print("{");
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.print("}");
            System.out.println();
        }
    }
}
