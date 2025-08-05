package lessons.lesson_25.task_01;

public class Dog extends LandAnimal {
    public Dog(double weight) {
        super(weight);
    }

    @Override
    public void feed() {
        System.out.println("Собака ест мясо");
    }
}
