package lessons.lesson_25.task_04;

public enum Planet {
    MERCURY("Меркурий", false),
    VENUS("Венера", false),
    EARTH("Земля", false),
    MARS("Марс", false),
    JUPITER("Юпитер", true),
    SATURN("Сатурн", true),
    URANUS("Уран", true),
    NEPTUNE("Нептун", true);

    private String russianName;
    private boolean isGasGiant;

    Planet(String russianName, boolean isGasGiant) {
        this.russianName = russianName;
        this.isGasGiant = isGasGiant;
    }

    public String getRussianName() {
        return russianName;
    }

    public boolean isGasGiant() {
        return isGasGiant;
    }
}
