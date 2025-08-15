package lessons.lesson_32.task_03;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<>();

        // put(key, value)
        products.put("Яблоко", 90.0);
        products.put("Персик", 190.20);
        products.put("Лимон", 140.0);
        products.put("Апельсин", 180.0);
        products.put("Ананас", 220.50);
        products.put("Дыня", 170.0);
        products.put("Банан", 110.0);

        System.out.println(products);

        // keySet()
        System.out.println("Названия всех продуктов:");
        for (String productTitle : products.keySet()) {
            System.out.println(productTitle);
        }

        // values()
        System.out.println("Цены всех продуктов:");
        for (Double price : products.values()) {
            System.out.println(price);
        }

        // entrySet()
        System.out.println("Цены всех продуктов:");
        for (Map.Entry<String, Double> pair : products.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
    }
}
