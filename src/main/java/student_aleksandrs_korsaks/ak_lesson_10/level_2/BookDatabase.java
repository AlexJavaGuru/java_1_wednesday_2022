package student_aleksandrs_korsaks.ak_lesson_10.level_2;

interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

}
