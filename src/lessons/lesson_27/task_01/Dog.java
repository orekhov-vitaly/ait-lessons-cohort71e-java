package lessons.lesson_27.task_01;

import java.util.Objects;

public class Dog {
    private String color;
    private int age;

    public Dog(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public Dog copy() {
        return new Dog(color, age);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, age);
    }
}
