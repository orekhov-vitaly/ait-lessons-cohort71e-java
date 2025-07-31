package lessons.lesson_22.task_03;

public class Dog {
    String breed;
    int age;
    double weight;

    public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public Dog() {
    }
}
