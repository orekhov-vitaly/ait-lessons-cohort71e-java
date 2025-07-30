package lessons.lesson_21;

/*
Создать пустую строку StringBuilder и заполнить её значениями
из различных переменных
 */

public class Task05 {
    public static void main(String[] args) {
        String str1 = "Привет! Меня зовут";
        String str2 = "и мне";
        String str3 = "лет";
        String name = "Макс";
        int age = 20;

        StringBuilder text = new StringBuilder();
        text
                .append(str1)
                .append(" ")
                .append(name)
                .append(" ")
                .append(str2)
                .append(" ")
                .append(age)
                .append(" ")
                .append(str3);
        System.out.println(text);

        text.appendCodePoint(123);
        System.out.println(text);

        System.out.println(".length(): " + text.length());

        System.out.println(".capacity(): " + text.capacity());

        char symbol = text.charAt(0);
        System.out.println(symbol);
    }
}
