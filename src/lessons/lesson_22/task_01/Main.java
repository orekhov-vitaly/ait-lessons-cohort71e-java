package lessons.lesson_22.task_01;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello, world!");

        // charAt
        char symbol = builder.charAt(2);
        System.out.println("Символ строки по индексу 2: " + symbol);

        // delete
        StringBuilder fruit = new StringBuilder("Apple Lemon Orange");
        fruit.delete(6, 12);
        System.out.println(fruit);

        // deleteCharAt
        fruit.deleteCharAt(5);
        System.out.println(fruit);

        // indexOf
        StringBuilder phrase = new StringBuilder("Hello; Java!");
        System.out.println(phrase.indexOf("Java"));

        // insert
        fruit.insert(5, " Grape ");
        System.out.println(fruit);

        // replace
        fruit.replace(6, 11, "Banana");
        System.out.println(fruit);

        // reverse
        StringBuilder text = new StringBuilder("Hello");
        text.reverse();
        System.out.println(text);

        // substring
        String appleWord = fruit.substring(0, 5);
        System.out.println(appleWord);
        System.out.println(fruit);

        // toString
        String allFruits = fruit.toString();
        System.out.println(allFruits);
    }
}