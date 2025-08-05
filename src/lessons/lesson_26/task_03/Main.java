package lessons.lesson_26.task_03;

public class Main {
    public static void main(String[] args) {
        int x = 6;
        int y = 6;

        Elephant elephant1 = new Elephant(5, 200);
        Elephant elephant2 = new Elephant(5, 200);

        System.out.println("x == y: " + (x == y));
        System.out.println("elephant1 == elephant2: " + (elephant1 == elephant2));
        System.out.println("elephant1.equals(elephant2): " + elephant1.equals(elephant2));
    }
}
