package lessons.lesson_26.task_01;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Белый", 3, 4.5);
        Cat cat2 = new Cat("Рыжий", 5, 5.53);

        cat1.sayMeow();
        cat1.play();
        cat2.sayMeow();
        cat2.play();

        System.out.println("Количество лап у каждого кота: " + Cat.pawsCount);

        Cat.pawsCount = 6;

        System.out.println(Cat.pawsCount);

        Cat.printInfo();

        System.out.println(cat1);
        System.out.println(cat2);
    }
}
