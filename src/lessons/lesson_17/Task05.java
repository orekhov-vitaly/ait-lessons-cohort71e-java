package lessons.lesson_17;

//        Напишите программу, которая проверяет на корректность адрес электронной почты,
//и выводит на консоль
//True, если адрес корректен, и False – если нет.
//Программа имеет одну строковую переменную – адрес электронной почты. Представим,
//что адрес корректен, если:
//        - он не менее 8 символов в длину,
//        - содержит «@»,
//        - содержит точку и
//        - не содержит «#».
//Вам помогут методы String - length и contains.

public class Task05 {
    public static void main(String[] args) {
        String email = "test@test.com";

        int emailLength = email.length();
        boolean isCorrectLength = emailLength >= 8;
        boolean isContainsAt = email.contains("@");
        boolean isContainsDot = email.contains(".");
        boolean isContainsSharp = email.contains("#");

        boolean isEmailCorrect = isCorrectLength && isContainsAt && isContainsDot && !isContainsSharp;

        // boolean isEmailCorrect = email.length() >= 8 && email.contains("@") && email.contains(".") && !email.contains("#");

        System.out.println(isEmailCorrect);
    }
}
