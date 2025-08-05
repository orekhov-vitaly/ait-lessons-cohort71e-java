package lessons.lesson_25.task_01;

public class Airplane implements Flyable {
    @Override
    public void takeOff() {
        System.out.println("Самолет взлетает");
    }

    @Override
    public void fly() {
        System.out.println("Самолет летит");
    }

    @Override
    public void land() {
        System.out.println("Самолет приземляется");
    }
}
