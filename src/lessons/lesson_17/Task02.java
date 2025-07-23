package lessons.lesson_17;

public class Task02 {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println("=====");

        int a = 7;
        int c = 10;

        boolean result = a > c;
        System.out.println("a > c - " + result);
        System.out.println("=====");

        result = a >= 7;
        System.out.println("a >= 7 - " + result);
        System.out.println("=====");

        System.out.println("c == 10 - " + (c == 10));
        System.out.println("=====");

        // === Logic operations ===

        boolean morning = false;
        boolean evening = true;
        boolean summer = true;
        boolean winter = false;

        result = winter && evening;
        System.out.println(result);
        System.out.println(morning || winter);

        System.out.println(true && true || false && false);
    }
}
