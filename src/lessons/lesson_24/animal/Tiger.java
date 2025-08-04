package lessons.lesson_24.animal;

public class Tiger extends LandAnimal{
    public Tiger(double weight) {
        super(weight);
    }

    @Override
    public void feed() {
        System.out.println("Тигр ест мясо");
    }
}
