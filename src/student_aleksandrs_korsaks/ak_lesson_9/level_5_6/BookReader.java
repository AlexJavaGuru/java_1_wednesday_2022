package student_aleksandrs_korsaks.ak_lesson_9.level_5_6;

import java.util.List;

interface BookReader {

    boolean addBook(Book bookToAdd);

    boolean deleteBook(String bookTitleToDelete);

    boolean checkBookAsReaden(String bookTitleToCheck);

    boolean uncheckBookAsReaden(String bookTitleToCheck);

    List<String> getBookListInString();

    List<Book> getAllBooksOfAuthor(String authorName);

    List<Book> getAllBooksOfTitle(String bookTitle);

    List<String> getAllReadenBooks();

    List<String> getAllUnreadenBooks();

}
