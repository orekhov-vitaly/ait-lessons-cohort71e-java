package lessons.lesson_31.task_01;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;

        boolean result = x == y;
        System.out.println("x = y: " + result);

        Cat cat1 = new Cat("Black", 4, 4.46);
        Cat cat2 = new Cat("Black", 4, 4.46);
        result = cat1 == cat2;
        result = cat1.equals(cat2);
        System.out.println("cat1 = cat2: " + result);
    }
}
