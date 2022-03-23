package student_aleksandrs_jakovenko.lesson_9.level_3;

interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}