package lessons.lesson_24.animal;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish(0.9);
        Dog dog = new Dog(20);

        System.out.println("Вес рыбы: " + fish.getWeight());
        System.out.println("Вес собаки: " + dog.getWeight());

        fish.setWeight(1.1);
        dog.setLegsCount(4);

        System.out.println("Вес рыбы: " + fish.getWeight());
        System.out.println("Количество лап у собаки: " + dog.getLegsCount());

        // Animal animal = new Animal(23); // ERROR!

        dog.feed();
        fish.feed();

        Bird bird = new Bird(0.3);
        Airplane airplane = new Airplane();

        bird.takeOff();
        bird.fly();
        bird.land();

        airplane.takeOff();
        airplane.fly();
        airplane.land();
    }
}
