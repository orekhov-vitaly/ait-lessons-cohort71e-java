package homeworks.homework_27;

/*
Создайте двумерный массив размером 10х10.
Заполните в цикле массив таким образом, чтобы он стал таблицей умножения (например, ячейка под индексами 4 и 6 должна содержать значение 24).
В следующем цикле выведите таблицу умножения в консоль. Ожидаемый результат:
0  0  0  0
0  1  2  3
0  2  4  6
0  3  6  9  ...  и так далее все 10 строк и 10 столбцов.
*/

public class task_01 {
    public static void main(String[] args) {
        int[][] multiplicationTable = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplicationTable[i][j] = i * j;
            }
        }

        printArray(multiplicationTable);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
