package lessons.lesson_25.task_01;

public class Tiger extends LandAnimal {
    public Tiger(double weight) {
        super(weight);
    }

    @Override
    public void feed() {
        System.out.println("Тигр ест мясо");
    }
}
