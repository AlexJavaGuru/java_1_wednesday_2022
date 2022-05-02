package student_aleksandr_zuk.lesson_9.level_3;

import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {

    Product[] products = new Product[0];

    @Override
    public void save(Product product) {
        Product[] array = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            array[i] = products[i];
        }
        array[array.length - 1] = product;
        products = array;

    }

    public Product[] getProducts() {
        return products;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getTitle().equals(productTitle)) {
                return Optional.ofNullable(products[i]);
            }
        }
        return Optional.empty();
    }
}
