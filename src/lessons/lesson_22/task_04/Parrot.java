package lessons.lesson_22.task_04;

public class Parrot {
    private String color;
    private int words;

    public Parrot(String color, int words) {
        this.color = color;
        this.words = words;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWords() {
        return words;
    }

    public void setWords(int words) {
        if(words < 0) {
            System.out.println("Количество слов не должно быть отрицательным");
        } else {
            this.words = words;
        }
    }
}
