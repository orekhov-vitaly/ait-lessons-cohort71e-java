package lessons.lesson_25.task_01;

public class Bird extends Animal implements Flyable {
    public Bird(double weight) {
        super(weight);
    }

    @Override
    public void feed() {
        System.out.println("Птица ест зерна");
    }

    @Override
    public void takeOff() {
        System.out.println("Птичка взлетает");
    }

    @Override
    public void fly() {
        System.out.println("Птичка летит");
    }

    @Override
    public void land() {
        System.out.println("Птичка приземляется");
    }
}
