package student_arturs_melnikovs.lesson_09.level_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BookReaderImpl implements BookReader{

    List<Book> library = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        if (!hasTitleAndAuthor(book)) {
            return false;
        } else if (library.contains(book)) {
            return false;
        } else {
            library.add(book);
            return true;
        }
    }

    @Override
    public boolean hasTitleAndAuthor(Book book) {
        return book.getAuthor() != null && book.getTitle() != null;
    }

    @Override
    public boolean deleteBook(Book book) {
        if (library.contains(book)) {
            library.remove(book);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void printLibrary() {
        for (Book book : library) {
            System.out.println(book.getTitle() + " [" + book.getAuthor() + "]");
        }
    }

    @Override
    public Book findByAuthor(String author) {
        for (Book book : library) {
            if (author.equals(book.getAuthor())) {
                return
            }
        }
    }

}
