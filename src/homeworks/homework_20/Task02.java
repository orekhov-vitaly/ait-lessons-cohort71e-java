package homeworks.homework_20;

/*
Бананы стоят 11 у.е., яблоки - 8 у.е. Вам нужно купить два килограмма бананов и три килограмма яблок.
Сохраните все эти данные в переменных. Напишите программу, которая выводит на экран фразу "Для покупки Х килограммов
бананов и Х килограммов яблок мне нужно Х у.е." В местах, где Х - нужно воспользоваться переменными. Напишите отдельный
метод, который считает и возвращает стоимость продукта и воспользуйтесь им два раза для расчёта стоимости яблок и бананов.
*/

public class Task02 {
    public static void main(String[] args) {
        int bananaPrice = 11;
        int applePrice = 8;
        int bananaQuantity = 2;
        int appleQuantity = 3;

        int bananaCost = getProductCost(bananaPrice, bananaQuantity);
        int appleCost = getProductCost(applePrice, appleQuantity);
        int productsCost = bananaCost + appleCost;

        System.out.println("Для покупки " + bananaQuantity + " килограммов бананов и " + appleQuantity + " килограммов яблок мне нужно " + productsCost + " у.е.");
    }

    public static int getProductCost(int price, int quantity) {
        return price * quantity;
    }
}
