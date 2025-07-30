package homeworks.homework_20;

/*
Напишите программу, которая хранит в переменных данные, какой сейчас по счёту день в году (например, 48),
и название следующего года (например, "Год Тигра"). Программа должна посчитать, сколько дней осталось до следующего года
и вывести на экран фразу по образцу - "Через 123 дня наступит Год Тигра". Для упрощения считайте, что в году всегда 365
дней. Оформите расчёт остатка количества дней до конца года в виде отдельного метода(с одним параметром). Также в
программе должен быть второй метод, куда Вы передаёте количество оставшихся дней и название года, а он выводит требуемую
строку на экран.
*/

public class Task01 {
    public static void main(String[] args) {
        int dayNumber = 48;
        String nameYear = "Год Тигра";

        int remainingDays = getRemainingDays(dayNumber);
        printPhrase(remainingDays, nameYear);
    }

    public static int getRemainingDays(int currentDay) {
        return 365 - currentDay;
    }

    public static void printPhrase(int days, String nameYear) {
        System.out.println("Через " + days + " дня наступит " + nameYear);
    }
}
