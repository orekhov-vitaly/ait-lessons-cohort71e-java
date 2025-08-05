package lessons.lesson_25.task_01;

public abstract class Animal {
    private double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void feed();
}
