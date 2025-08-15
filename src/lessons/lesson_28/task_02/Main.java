package lessons.lesson_28.task_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("Hello");
        words.add("World");
        words.add("I");
        words.add("study");
        words.add("Java");

        System.out.println(words);

        // remove(value)
        System.out.println("\n==== remove(value) =====)");
        System.out.println(words.remove("World"));
        System.out.println(words);
        System.out.println(words.remove("Python"));

        // remove(index)
        System.out.println("\n==== remove(index) =====)");
        System.out.println(words.remove(1));
        System.out.println(words);

        // isEmpty()
        boolean result = words.isEmpty();
        System.out.println(result);

        words.remove(0);
        words.remove(0);
        words.remove(0);
        System.out.println(words.isEmpty());
    }
}
