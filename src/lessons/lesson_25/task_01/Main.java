package lessons.lesson_25.task_01;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(22);

        Animal animalDog = new Dog(25);

        dog1.feed();
        animalDog.feed();

        System.out.println("======\n");

        Animal[] animals = new Animal[5];
        animals[0] = new Cat(5);
        animals[1] = new Tiger(105);
        animals[2] = new Bird(1);
        animals[3] = new Fish(5);
        animals[4] = new Dog(20);

        for (Animal animal : animals) {
            animal.feed();
        }

        System.out.println("======\n");

        Flyable[] flyingThings = new Flyable[3];
        flyingThings[0] = new Airplane();
        flyingThings[1] = new Bird(4.4);
        flyingThings[2] = new Airplane();

        for (Flyable flyingThing : flyingThings) {
            flyingThing.takeOff();
            flyingThing.fly();
            flyingThing.land();
            System.out.println("\n");
        }
    }
}
