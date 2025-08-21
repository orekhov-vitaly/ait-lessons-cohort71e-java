package homeworks.homework_37.task_02;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        try {
            if (product.getTitle().isEmpty()) {
                throw new ProductEmptyTitleException("Название продукта не указано");
            } else if (product.getPrice() < 0) {
                throw new ProductIncorrectPriceException("Некорректно указана цена");
            }
            products.add(product);
            System.out.println("Продукт успешно добавлен");
        } catch (ProductEmptyTitleException e) {
            System.out.println("Ошибка! " + e.getMessage());
        } catch (ProductIncorrectPriceException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
    }

    public Product findByTitle(String title) throws ProductNotFoundException {
        for (Product product : products) {
            if (product.getTitle().equals(title)) {
                return product;
            }
        }
        // return null;

        throw new ProductNotFoundException("Продукт " + title + " не найден");
    }

    @Override
    public String toString() {
        return products.toString();
    }
}
