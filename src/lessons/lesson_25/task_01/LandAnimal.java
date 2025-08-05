package lessons.lesson_25.task_01;

public abstract class LandAnimal extends Animal {
    private int legsCount;

    public LandAnimal(double weight) {
        super(weight);
    }

    public int getLegsCount() {
        return legsCount;
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }
}
