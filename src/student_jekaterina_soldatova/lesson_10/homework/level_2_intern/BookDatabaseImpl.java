package student_jekaterina_soldatova.lesson_10.homework.level_2_intern;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase{

    List<Book> bookList = new LinkedList<>();

    @Override
    public Long save(Book book) {
        bookList.add(book);
        return (long) bookList.indexOf(book);
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book: bookList) {
            if (book.getId() == bookId) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        if (bookList.contains(book)) {
            bookList.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book: bookList) {
            if (book.getId() == bookId) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> listOfBooksByAuthor = new LinkedList<>();
        for (Book book: bookList) {
            if (book.getAuthor().equals(author)) {
                listOfBooksByAuthor.add(book);
            }
        }
        return listOfBooksByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> listOfBooksWithTitle = new LinkedList<>();
        for (Book book: bookList) {
            if (book.getTitle().equals(title)) {
                listOfBooksWithTitle.add(book);
            }
        }
        return listOfBooksWithTitle;
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

}
