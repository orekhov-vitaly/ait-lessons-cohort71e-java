package lessons.lesson_17;

public class Task03 {
    public static void main(String[] args) {
        /*
        Поблизости есть 2 магазина Lidl и Kaufland. Проверить можем
        ли мы сходить в магазин
         */

        boolean isLildOpen = true;
        boolean isKauflandOpen = false;

        boolean canBayProduct = isLildOpen || isKauflandOpen;
        System.out.println("Можно ли купить продукты? - " + canBayProduct);
    }
}
