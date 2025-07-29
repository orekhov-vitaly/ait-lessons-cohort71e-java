package lessons.lesson_20;

public class Methods {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Lemon", "Peach", "Banana"};
        String[] names = {"Mary", "Bob", "Tom", "James"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(i + 1 + ". " + fruits[i]);
        }
        System.out.println("=====\n");

        for (int i = 0; i < names.length; i++) {
            System.out.println(i + 1 + ". " + names[i]);
        }
        System.out.println("=====\n");

        printArray(fruits);
        System.out.println("=====\n");
        printArray(names);
        System.out.println("=====\n");
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + ". " + array[i]);
        }
    }
}
