package homeworks.homework_25;

public enum DayOfWeek {
    MONDAY("понедельник"),
    TUESDAY("вторник"),
    WEDNESDAY("среда"),
    THURSDAY("четверг"),
    FRIDAY("пятница"),
    SATURDAY("суббота"),
    SUNDAY("воскресенье");

    private String russianName;

    DayOfWeek(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }
}
