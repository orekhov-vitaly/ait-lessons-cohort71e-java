package lessons.lesson_24.animal;

public class Dog extends LandAnimal{
    public Dog(double weight) {
        super(weight);
    }

    @Override
    public void feed() {
        System.out.println("Собака ест мясо");
    }
}
