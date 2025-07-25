package lessons.lesson_18;

public class Task01 {
    public static void main(String[] args) {
        int number = 1;

        switch (number) {
            case 1:
                System.out.println("Переменная равно единице");
                // break;
            case 2:
                System.out.println("Переменная равно двойке");
                break;
            case 3:
                System.out.println("Переменная равно тройке");
                break;
            default:
                System.out.println("Переменная больше трёх");
        }
    }
}
