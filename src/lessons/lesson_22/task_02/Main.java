package lessons.lesson_22.task_02;

public class Main {
    public static void main(String[] args) {
        System.out.println("======= Cat 1 =======");
        Cat cat1 = new Cat("Balck", 6, 6.5);

        System.out.println("Cat1 color: " + cat1.color);
        System.out.println("Cat1 age: " + cat1.age);
        System.out.println("Cat1 weight: " + cat1.weight);

        cat1.sayMeow();
        cat1.play();

        System.out.println("\n======= Cat 2 =======");

        Cat cat2 = new Cat("White", 5, 8.1);

        System.out.println("Cat2 color: " + cat2.color);
        System.out.println("Cat2 age: " + cat2.age);
        System.out.println("Cat2 weight: " + cat2.weight);

        cat2.sayMeow();
        cat2.play();
    }
}
