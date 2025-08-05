package homeworks.homework_26;

/*
1. Напишите класс Книга.
2. У Книги должны быть характеристики - год издания, название, имя автора.
3. Напишите класс Main с методом main, в нём создайте объект книги с любыми значениями характеристик.
4. Создайте вторую переменную для книги и присвойте в эту переменную значение первой переменной.
5. Убедитесь, как мы делали это на занятии, что это одна и та же книга, а не две книги.
6. Доработайте класс Книга так, чтобы он поддерживал клонирование.
7. При помощи метода clone создайте копию книги.
8. Убедитесь, что это действительно два объекта книги, а не одна и та же книга.
*/

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book1 = new Book(2014, "Java. Руководство для начинающих", "Герберт Шилдт");
        Book book2 = book1;

        System.out.println(book1);
        System.out.println(book2);
        System.out.println("=========\n");

        book2.setPublicationYear(2013);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println("=========\n");

        Book book3 = book1.clone();
        book1.setPublicationYear(2015);
        book1.setName("Большая книга CSS3");
        book1.setAuthor("Дэвид Макфарланд");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
