package student_jekaterina_soldatova.lesson_10.homework.level_2_intern;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

class BookDatabaseImpl implements BookDatabase{

    List<Book> bookList = new LinkedList<>();
    private static final AtomicLong count = new AtomicLong(0);

    List<Book> getBookList() {
        return bookList;
    }

    @Override
    public void save(Book book) {
        bookList.add(book);
        book.setId(count.incrementAndGet());
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book: bookList) {
            if (book.getId().equals(bookId)) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (Book item: bookList) {
            if (book.getTitle().equals(item.getTitle()) && book.getAuthor().equals(item.getAuthor())) {
                bookList.remove(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book: bookList) {
            if (book.getId().equals(bookId)) {
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

    @Override
    public void deleteByAuthor(String author) {
        for (Book book: bookList) {
            if (book.getAuthor().equals(author)) {
                bookList.remove(book);
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for (Book book: bookList) {
            if (book.getTitle().equals(title)) {
                bookList.remove(book);
            }
        }
    }


}
