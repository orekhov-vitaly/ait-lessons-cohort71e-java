package lessons.lesson_37.task_02;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findByTitle(String title) throws ProductNotFoundException{
        for (Product product : products) {
            if (product.getTitle().equals(title)) {
                return product;
            }
        }
        // return null;

        throw new ProductNotFoundException("Продукт " + title + " не найден");
    }
}
