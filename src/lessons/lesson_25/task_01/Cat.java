package lessons.lesson_25.task_01;

public class Cat extends LandAnimal {
    public Cat(double weight) {
        super(weight);
    }

    @Override
    public void feed() {
        System.out.println("Кот ест мышек");
    }
}
