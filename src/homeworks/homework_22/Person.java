package homeworks.homework_22;

/*
Задача:
Написать класс Person.
У человека должно быть имя, возраст, е-мейл, номер телефона.
Сделать один конструктор для создания объекта человека сразу со всеми параметрами.
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
        if (name == null || name.length() == 0) {
            System.out.println("Имя не введено");
            this.name = "No name";
        } else {
            this.name = name;
        }

        if (age < 0) {
            System.out.println("Возраст не может быть отрицательным");
        } else {
            this.age = age;
        }

        if (isEmailValid(email)) {
            this.email = email;
        } else {
            System.out.println("Введен некорректный email");
        }

        if (phone == null) {
            System.out.println("Телефон не введен");
        } else {
            this.phone = phone;
        }
    }

    public boolean isEmailValid(String email) {
        if (email == null) return false;

        int indexAt = email.indexOf("@");
        int lastAt = email.lastIndexOf("@");
        if (indexAt < 0 || indexAt != lastAt) return false;

        int dotIndexAfterAt = email.indexOf(".", indexAt);
        if (dotIndexAfterAt == -1) return false;

        int lastDotIndex = email.lastIndexOf(".");
        if (lastDotIndex >= email.length() - 2) return false;

        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() == 0) {
            System.out.println("Имя не введено");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст не может быть отрицательным");
        } else {
            this.age = age;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        } else {
            System.out.println("Введен некорректный email");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null) {
            System.out.println("Телефон не введен");
        } else {
            this.phone = phone;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
