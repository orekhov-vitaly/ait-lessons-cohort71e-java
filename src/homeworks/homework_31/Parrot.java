package homeworks.homework_31;

public class Parrot implements Comparable<Parrot>{
    private int age;
    private int wordsCount;

    public Parrot(int age, int wordsCount) {
        this.age = age;
        this.wordsCount = wordsCount;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWordsCount() {
        return wordsCount;
    }

    public void setWordsCount(int wordsCount) {
        this.wordsCount = wordsCount;
    }

    @Override
    public int compareTo(Parrot other) {
        return Integer.compare(age, other.age);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "age=" + age +
                ", wordsCount=" + wordsCount +
                '}';
    }
}
