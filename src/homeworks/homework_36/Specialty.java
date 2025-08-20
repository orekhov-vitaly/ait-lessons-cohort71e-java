package homeworks.homework_36;

public enum Specialty {
    ENGINEER("Инженер"),
    DEVELOPER("Разработчик"),
    HISTORIAN("Историк");

    private final String russianDescription;

    Specialty(String russianDescription) {
        this.russianDescription = russianDescription;
    }

    public String getRussianDescription() {
        return russianDescription;
    }
}
