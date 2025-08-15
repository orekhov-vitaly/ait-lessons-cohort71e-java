package lessons.lesson_29.task_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        list.add("ggg");

        System.out.println(list);

        Spliterator<String> spliterator = list.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();

        System.out.println("Spliterator");
        spliterator1.forEachRemaining(System.out::println);
        spliterator.forEachRemaining(System.out::println);
    }
}
