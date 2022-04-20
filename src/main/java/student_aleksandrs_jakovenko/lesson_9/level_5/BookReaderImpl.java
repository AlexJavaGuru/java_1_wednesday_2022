package student_aleksandrs_jakovenko.lesson_9.level_5;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    List<Book> library = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        if (!isBookValid(book) || library.contains(book)) {
            return false;
        } else {
            library.add(book);
            return true;
        }
    }

    @Override
    public boolean isBookValid(Book book) {
        if (book.getBookName().equals("") || book.getAuthor().equals("")) {
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteBook(Book book) {
        if (library.contains(book)) {
            library.remove(book);
            return true;
        } else return false;
    }

    @Override
    public String[] printBooks() {
        String[] books = new String[library.size()];
        for (int i = 0; i < library.size(); i++) {
            books[i] = library.get(i).getBookName() + " [" + library.get(i).getAuthor() + "]";
        }
        return books;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> list = new ArrayList<>();
        for (Book book : library) {
            if (book.getAuthor().startsWith(author)) {
                list.add(book);
            }
        }
        return list;
    }

    @Override
    public List<Book> findByBookName(String bookName) {
        List<Book> list = new ArrayList<>();
        for (Book book : library) {
            if (book.getBookName().startsWith(bookName)) {
                list.add(book);
            }
        }
        return list;
    }
}
