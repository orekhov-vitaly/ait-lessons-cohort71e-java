package lessons.lesson_37.task_02;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        service.addProduct(new Product("Banan", 120));
        service.addProduct(new Product("Apple", 70));
        service.addProduct(new Product("Persik", 230));

        try {
            Product product = service.findByTitle("Apple");
            System.out.println("Price of apple: " + product.getPrice());

            product = service.findByTitle("Watermelon");
            System.out.println("Price of watermelon: " + product.getPrice());
        } catch (ProductNotFoundException error) {
            System.out.println("Ошибка! " + error.getMessage());
        }

        System.out.println("Программа завершена");
    }
}
