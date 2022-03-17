package student_arturs_melnikovs.lesson_09.level_03;

interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}
