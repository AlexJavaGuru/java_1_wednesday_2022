package student_jekaterina_soldatova.lesson_09.level_3_junior;

interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}