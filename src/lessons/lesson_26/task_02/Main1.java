package lessons.lesson_26.task_02;

public class Main1 {
    public static void main(String[] args) {
        Integer number = new Integer(11); // устаревший метод
        Integer number1 = 17;

        System.out.println(number);
        System.out.println(number1);

        int primitiveValur = 20;
        primitiveValur = number1;
        System.out.println(primitiveValur);
    }
}
