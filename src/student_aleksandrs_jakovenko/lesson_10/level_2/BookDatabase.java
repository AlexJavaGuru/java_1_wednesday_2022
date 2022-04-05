package student_aleksandrs_jakovenko.lesson_10.level_2;

import java.util.List;
import java.util.Optional;

interface BookDatabase {

    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);
    Optional<Book> findById(Long bookId);
    List<Book> findByAuthor(String author);
}
