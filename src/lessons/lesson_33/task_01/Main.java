package lessons.lesson_33.task_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<>();

        products.put("Яблоко", 90.0);
        products.put("Персик", 190.20);
        products.put("Лимон", 140.0);
        products.put("Апельсин", 180.0);
        products.put("Ананас", 220.50);
        products.put("Дыня", 170.0);
        products.put("Банан", 110.0);

        System.out.println(products);

        // Task 1. Удалить все продукты на букву А
//        Iterator<String> iterator = products.keySet().iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next().startsWith("А")) {
//                iterator.remove();
//            }
//        }

        // Task 2. Удалить все продукты на букву А дешевле 250
        Iterator<Map.Entry<String, Double>> iterator = products.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Double> pairObj = iterator.next();
            if (pairObj.getKey().startsWith("А") && pairObj.getValue() < 250) {
                iterator.remove();
            }
        }

        System.out.println(products);

    }
}
