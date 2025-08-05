package homeworks.homework_25;

/*
1. Создайте перечисление с днями недели.
2. У каждого дня недели должно быть название на русском (или любом другом удобном) языке, например - "Среда".
3. В методе main создайте переменную, которая может содержать день недели и инициализируйте её каким-нибудь днём.
4. Напишите switch, который в будни выводит в консоль фразу - "Сегодня - <здесь_название_дня_на_другом_языке>". Название следует не писать руками, а брать из объекта при помощи геттера.
5. В любой из выходных дней фраза должна быть одинаковая - "Сегодня выходной день".
*/

public class Main {
    public static void main(String[] args) {
        DayOfWeek[] days = DayOfWeek.values();

        for(DayOfWeek day : days) {
            switch (day) {
                case MONDAY:
                    System.out.println("Сегодня - " + day.getRussianName());
                    break;
                case TUESDAY:
                    System.out.println("Сегодня - " + day.getRussianName());
                    break;
                case WEDNESDAY:
                    System.out.println("Сегодня - " + day.getRussianName());
                    break;
                case THURSDAY:
                    System.out.println("Сегодня - " + day.getRussianName());
                    break;
                case FRIDAY:
                    System.out.println("Сегодня - " + day.getRussianName());
                    break;
                default:
                    System.out.println("Сегодня выходной день");
            }
        }
    }
}
