package lessons.lesson_24.animal;

public abstract class LandAnimal extends Animal{
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
