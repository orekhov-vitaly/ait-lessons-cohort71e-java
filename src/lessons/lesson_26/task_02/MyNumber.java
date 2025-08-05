package lessons.lesson_26.task_02;

public class MyNumber {
    private int value;

    public MyNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void decrease() {
        value--;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
