package lessons.lesson_27.task_01;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Black", 5);
        Dog dog2 = dog1.copy();

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println("dog1 == dog2: " + (dog1 == dog2));
        System.out.println("dog1.equals(dog2): " + dog1.equals(dog2));
    }
}
