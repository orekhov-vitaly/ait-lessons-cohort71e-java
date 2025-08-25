package lessons.lesson_40.task_01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Старт программы");

        int x = 10;
        int y = 0;

        try {
            System.out.println("Начало блока try");

            int result = x / y;
            System.out.println("Результат:" + result);

            System.out.println("Конец блока try");
        } catch (ArithmeticException e) {
            System.out.println("Начало блока catch");

            System.out.println("Ошибка! " + e.getMessage());

            System.out.println("Конец блока catch");
        } finally {
            System.out.println("Что-то, что выполняется в любом случае");
        }

        System.out.println("Программа успешно завершена");
    }
}
