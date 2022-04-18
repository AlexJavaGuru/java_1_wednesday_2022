package student_aleksandrs_korsaks.ak_lesson_9.level_3;

import java.util.Arrays;

class InMemoryDatabase implements ProductDatabase {

    Product[] arrayOfProducts = new Product[0];

    @Override
    public Product[] getArrayOfProducts() {
        return arrayOfProducts;
    }

    @Override
    public void save(Product product) {
        arrayOfProducts = Arrays.copyOf(arrayOfProducts, arrayOfProducts.length + 1);
        arrayOfProducts[arrayOfProducts.length - 1] = product;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : arrayOfProducts) {
            if (product.getTitle().equalsIgnoreCase(productTitle)) {
                return product;
            }
        }
        return null;
    }

}
