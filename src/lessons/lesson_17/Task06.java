package lessons.lesson_17;

public class Task06 {
    public static void main(String[] args) {
        int x = 4;

        if (x > 5) {
            System.out.println("Переменная X больше 5");
        } else {
            System.out.println("Переменная X не больше 5");
        }

        System.out.println("========\n");

        int y = 5;

        if (y > 5) {
            System.out.println("Переменная Y больше, чем 5");
        } else if (y < 5) {
            System.out.println("Переменная Y меньше, чем 5");
        } else {
            System.out.println("Переменная Y равна 5");
        }
    }
}
