package student_jekaterina_soldatova.lesson_09.level_3_junior;

import java.util.Optional;

interface ProductDatabase {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}