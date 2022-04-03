package student_aleksandrs_jakovenko.lesson_9.level_5;

import java.util.List;

interface BookReader {

    boolean addBook(Book book);
    boolean isBookValid(Book book);
    boolean deleteBook(Book book);
    String[] printBooks();
    List<Book> findByAuthor(String author);
    List<Book> findByBookName(String bookName);
}
