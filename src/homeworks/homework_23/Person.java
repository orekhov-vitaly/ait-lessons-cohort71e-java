package homeworks.homework_23;

/*
Задача:
Написать класс Person.
У человека должно быть имя, возраст, е-мейл, номер телефона.
Все поля должны быть закрыты от модификации извне.
Сделать один конструктор для создания объекта человека сразу со всеми параметрами.
Сделать доступ ко всем полям через геттер, кроме номера телефона.
Сделать возможность изменять е-мейл человека через сеттер.
Сеттер должен контролировать и не разрешать в качестве е-мейла вставлять пустую строку.
В классе Main создать объект человека.
Изменить его е-мейл.
Вывести все доступные характеристики человека в консоль.
*/

public class Person {
    private String name;
    private int age;
    private String email;
    private String phone;

    public Person(String name, int age, String email, String phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.isEmpty()) {
            this.email = email;
        }
    }

    @Override
    public String toString() {
        return "Person: " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'';
    }
}
