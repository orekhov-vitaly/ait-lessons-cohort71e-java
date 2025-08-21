package homeworks.homework_37.task_02;

import java.util.Objects;

public class Product {
    private String title;
    private double price;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Objects.equals(title, product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
