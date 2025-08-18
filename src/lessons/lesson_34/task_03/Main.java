package lessons.lesson_34.task_03;

import java.util.Map;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Способ 1
        Function<Double, Long> function = x -> {
            Long result1 = Math.round(x);
            Long result2 = result1 * result1;
            return result2;
        };

        System.out.println("Результат первого способа");
        System.out.println("Результат 1: " + function.apply(5.2));
        System.out.println("Результат 1: " + function.apply(6.9));

        // Способ 2
        Function<Double, Long> function1 = x -> Math.round(x);
        System.out.println("Промежуточное значение (округление): " + function1.apply(5.4));

        Function<Long, Long> function2 = x -> x * x;
        // System.out.println("Промежуточное значение (возведение в квадратную степень): " + function2.apply(function1.apply(5.4)));

        Function<Double, Long> targetFunction = function1.andThen(function2);
        System.out.println("Результат второго способа");
        System.out.println("Результат 3: " + targetFunction.apply(3.3));
        System.out.println("Результат 4: " + targetFunction.apply(3.8));
    }
}
