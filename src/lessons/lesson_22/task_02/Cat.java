package lessons.lesson_22.task_02;

public class Cat {
    String color;
    int age;
    double weight;

    public Cat(String color, int age, double weight) {
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public void play() {
        System.out.println(color + " cat playing!");
    }
}