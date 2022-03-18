package student_arturs_melnikovs.lesson_09.level_05;

import java.util.List;

interface BookReader {

    boolean addBook(Book book);
    boolean hasTitleAndAuthor(Book book);
    boolean deleteBook(Book book);
    void printLibrary();
    Book findByAuthor(String author);
}
