package lessons.lesson_26.task_03;

import java.util.Objects;

public class Elephant {
    private int age;
    private int weight;

    public Elephant(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Elephant elephant = (Elephant) o;
        return age == elephant.age && weight == elephant.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weight);
    }
}
