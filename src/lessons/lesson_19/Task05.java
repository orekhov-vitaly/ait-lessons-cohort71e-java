package lessons.lesson_19;

// Вывести на экран только те имена, которые не начинаются на J
// Перебор массива необходимо сделать без использования for-each

public class Task05 {
    public static void main(String[] args) {
        String[] names = {"John", "Bill", "James", "Aleks", "Mary"};

        for (int i = 0; i < names.length; i++) {
            if(names[i].startsWith("J")) {
                continue;
            }
            System.out.println(names[i]);
        }
    }
}
