package lessons.lesson_24.animal;

public class Cat extends LandAnimal{
    public Cat(double weight) {
        super(weight);
    }

    @Override
    public void feed() {
        System.out.println("Кот ест мышек");
    }
}
