package lessons.lesson_34.task_01;

public enum Degree {
    BACHELOR("Бакалавр"),
    MASTER("Магистр");

    private final String russianDescription;

    Degree(String russianDescription) {
        this.russianDescription = russianDescription;
    }

    public String getRussianDescription() {
        return russianDescription;
    }
}
