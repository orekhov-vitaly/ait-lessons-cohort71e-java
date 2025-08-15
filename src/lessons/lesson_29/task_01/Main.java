package lessons.lesson_29.task_01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Monkey");
        animals.add("Dog");
        animals.add("Tiger");

        System.out.println(animals);

        String result = "";
        for (int i = 0; i < animals.size(); i++) {
            if (i != animals.size() - 1) {
                result += animals.get(i) + ", ";
            } else {
                result += animals.get(i);
            }
        }
        System.out.println(result);
    }
}
