package student_aleksandrs_korsaks.ak_lesson_9.level_3;

import java.util.Optional;

interface ProductDatabase {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

    Product[] getArrayOfProducts();

}

//Является ли следующий интерфейс функциональным? (Task 7)
// Нет.