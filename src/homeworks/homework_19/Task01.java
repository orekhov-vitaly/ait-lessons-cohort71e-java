package homeworks.homework_19;

/*
Создайте массив, который содержит несколько названий фруктов.
Выведите его на экран так, чтобы каждое название выводилось с новой строки.
*/

public class Task01 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Banana", "Kiwi", "Ananas"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
