package lessons.lesson_33.task_02;

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
