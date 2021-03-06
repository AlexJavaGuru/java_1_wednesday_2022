package student_arturs_melnikovs.lesson_09.level_05;

import java.util.List;
import java.util.Optional;

interface BookReader {

    boolean addBook(Book book);
    boolean hasTitleAndAuthor(Book book);
    boolean deleteBook(Book book);
    String[] getListOfAllBooks();
    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String title);
    boolean markAsRead(Book book);
    boolean markAsUnread(Book book);
    List<String> getListOfAllReadBooks();
    List<String> getListOfAllUnreadBooks();
}
