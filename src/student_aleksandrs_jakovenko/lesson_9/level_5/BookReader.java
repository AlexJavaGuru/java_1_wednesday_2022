package student_aleksandrs_jakovenko.lesson_9.level_5;

import java.util.List;

interface BookReader {

    boolean addBook(String bookName, String author);
    String convertBook(String bookName, String author);
    boolean deleteBook(String bookName, String author);
    void printBooks();
}
