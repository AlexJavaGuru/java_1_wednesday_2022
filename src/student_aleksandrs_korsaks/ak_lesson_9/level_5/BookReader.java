package student_aleksandrs_korsaks.ak_lesson_9.level_5;

import java.util.List;

interface BookReader {

    boolean addBook(Book bookToAdd);

    boolean deleteBook(String bookTitleToDelete);

    List<String> getBookListInString();

}
