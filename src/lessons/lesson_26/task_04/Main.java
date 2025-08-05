package lessons.lesson_26.task_04;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog1 = new Dog("Black", 5);

        Dog dog2 = dog1;

        dog2.setAge(6);

        Dog dog3 = dog1.clone();

        dog3.setAge(8);
    }
}
