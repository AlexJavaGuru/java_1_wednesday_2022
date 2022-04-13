package student_arturs_melnikovs.lesson_09.level_03;

import java.util.Optional;

interface ProductDatabase {

    void save(Product product);
    Product[] getProducts();
    Optional<Product> findByTitle(String productTitle);

}
