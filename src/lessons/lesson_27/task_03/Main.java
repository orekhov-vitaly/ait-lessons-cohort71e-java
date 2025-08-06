package lessons.lesson_27.task_03;

public class Main {
    public static void main(String[] args) {
        String[] phrase = {
                "Hello",
                "world",
                "Java"
        };

        printArray(phrase);
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+1 + ". " + array[i]);
        }
    }
}
