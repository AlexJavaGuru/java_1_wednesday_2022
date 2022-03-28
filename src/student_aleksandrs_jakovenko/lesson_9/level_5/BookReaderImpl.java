package student_aleksandrs_jakovenko.lesson_9.level_5;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    List<Book> library = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        if (book.getBookName().equals("") || book.getAuthor().equals("")) {
            return false;
        } else if (library.contains(book)) {
            return false;
        } else {
            library.add(book);
            return true;
        }
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
            if (author.startsWith(book.getAuthor())) {
                list.add(book);
            }
        }
        return list;
    }
}
