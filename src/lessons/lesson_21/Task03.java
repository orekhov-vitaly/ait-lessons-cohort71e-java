package lessons.lesson_21;

public class Task03 {
    public static void main(String[] args) {
        String text1 = "Hi";
        String text2 = "Hi";
        String text3 = new String("Java!");
        String text4 = new String("Java");

        System.out.println(text3.contains(text4));
        System.out.println(text3.equals(text4));
    }
}
