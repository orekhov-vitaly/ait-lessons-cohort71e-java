package lessons.lesson_17;

// Напишите программу, которая определяет, можно ли сейчас идти гулять.
//Программа должна иметь две переменных – isWeekend и isRain.
//Гулять можно идти, если сейчас выходные и нет дождя.
//Выведите результат её работы на экран таким образом – «Можно ли
//сейчас гулять? – true/false».

public class Task04 {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = isWeekend && !isRain;
        System.out.println("Можно ли сейчас гулять? – " + canWalk);
    }
}
