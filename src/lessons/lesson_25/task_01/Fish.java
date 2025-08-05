package lessons.lesson_25.task_01;

public class Fish extends Animal {
    public Fish(double weight) {
        super(weight);
    }

    @Override
    public void feed() {
        System.out.println("Рыба ест водоросли");
    }
}
