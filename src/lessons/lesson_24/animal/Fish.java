package lessons.lesson_24.animal;

public class Fish extends Animal{
    public Fish(double weight) {
        super(weight);
    }

    @Override
    public void feed() {
        System.out.println("Рыба ест водоросли");
    }
}
