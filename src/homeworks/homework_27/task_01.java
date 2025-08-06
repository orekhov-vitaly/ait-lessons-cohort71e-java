package homeworks.homework_27;

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
