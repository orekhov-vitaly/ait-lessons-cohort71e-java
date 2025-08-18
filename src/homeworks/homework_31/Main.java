package homeworks.homework_31;

/*
Создайте класс Parrot (попугай).
У попугая должны быть две целочисленные характеристики - возраст и количество слов, которые он знает.
Попугаи должны уметь сравнивать сами себя с другими попугаями по возрасту (вспомните, какой интерфейс для этого нужен).
Создайте TreeSet из нескольких попугаев и выведите его в консоль. Ожидаемый результат - попугаи отсортированы по возрасту.
Требуется реализовать сортировку попугаев по количеству слов. Создайте для этого ParrotComparator (вспомните, какой интерфейс для этого нужен).
Компаратор попугаев должен уметь сравнивать попугаев по количеству слов.
Создайте TreeSet попугаев, передав туда объект компаратора, и выведите его в консоль. Ожидаемый результат - попугаи отсортированы по количеству слов.
 */

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Parrot> parrots1 = new TreeSet<>();

        parrots1.add(new Parrot(1, 20));
        parrots1.add(new Parrot(5, 63));
        parrots1.add(new Parrot(3, 18));
        parrots1.add(new Parrot(2, 0));
        parrots1.add(new Parrot(6, 15));

        for (Parrot parrot : parrots1) {
            System.out.println(parrot);
        }
        System.out.println("==========");

        Set<Parrot> parrots2 = new TreeSet<>(new ParrotComparator());

        parrots2.add(new Parrot(1, 20));
        parrots2.add(new Parrot(5, 63));
        parrots2.add(new Parrot(3, 18));
        parrots2.add(new Parrot(2, 0));
        parrots2.add(new Parrot(6, 15));

        for (Parrot parrot : parrots2) {
            System.out.println(parrot);
        }
    }
}
