package lessons.lesson_22.task_03;

import lessons.lesson_22.task_02.Cat;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Овчарка", 7, 18.5);
        System.out.println("Порода: " + dog1.breed);


        Dog dog2 = new Dog("Йорк", 4);

        Dog dog3 = new Dog();
    }
}
