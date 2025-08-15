package lessons.lesson_32.task_02;

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

        // get(key)
        Double price = products.get("Ананас");
        System.out.println("Цена: " + price);

        price = products.get("Кокос"); // null
        System.out.println("Цена: " + price);

        products.put("Вишня", 90.0);
        System.out.println(products);

        products.put("Персик", 210.50);
        System.out.println(products);

        products.putIfAbsent("Виноград", 250.6);
        System.out.println(products);

        products.putIfAbsent("Персик", 250.0);
        System.out.println(products);

        System.out.println("Количество: " + products.size());

        System.out.println(products.containsKey("Персик"));
        System.out.println(products.containsKey("Киви"));

        System.out.println(products.containsValue(90.0));

        String productTitle = "Дыня";
        System.out.println(products.get(productTitle).equals(170.0));

        productTitle = "Вишня";
        System.out.println(products.get(productTitle).equals(170.0));

        productTitle = "Ананас";
        if (products.containsKey(productTitle)) {
            System.out.println(products.get(productTitle).equals(170.0));
        } else {
            System.out.println("Продукта нет");
        }

        // getOrDefault(key, valueDefault)
        System.out.println(products.getOrDefault("Вишня", 0.0));
        System.out.println(products.getOrDefault("Apple", 0.0));

        // isEmpty()
        System.out.println("Map is empty? " + productTitle.isEmpty());

        // remove(key)
        System.out.println(products.remove("Яблоко"));
        System.out.println(products);

        // remove(key, value)
        boolean result = products.remove("Ананас", 220.5);
        System.out.println(products);
        System.out.println(result);

        result = products.remove("Лимон", 220.5);
        System.out.println(products);
        System.out.println(result);

        // replace()
        System.out.println(products.replace("Вишня", 120.0));
        System.out.println(products);
        System.out.println(products.replace("Кокос", 120.0));
        System.out.println(products);

        // clear()
        products.clear();
        System.out.println(products);
    }
}
