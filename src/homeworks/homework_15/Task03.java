package homeworks.homework_15;

/*
 Исходные данные: курс евро к доллару - 1.09. У Вас на руках 1000 долларов.
 Ставка по банковскому вкладу в евро - 5% годовых.
 Напишите программу, которая считает сумму Вашего чистого дохода в евро и в долларах,
 если Вы положите деньги на вклад на три года, учитывая, что проценты на вклад начисляются ежегодно.
 */

public class Task03 {
    public static void main(String[] args) {
        double rateEuroDoll = 1.09;
        double balanceDoll = 1000;
        double depositRate = 5;

        double incomeNetDoll = balanceDoll * (depositRate / 100 + 1) * (depositRate / 100 + 1) * (depositRate / 100 + 1) - balanceDoll;
        double incomeNetEuro = incomeNetDoll / rateEuroDoll;

        System.out.println("Чистый доход:");
        System.out.println("$" + incomeNetDoll);
        System.out.println("€" + incomeNetEuro);
    }
}
