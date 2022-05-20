package student_aleksandrs_korsaks.ak_lesson_10.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {

    private Long id = 1L;

    private List<Book> bookList = new ArrayList<>();


    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public Long save(Book book) {
        bookList.add(book);
        book.setId(id++);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        return bookList.removeIf(book -> book.getId().equals(bookId));
    }

    @Override
    public boolean delete(Book book) {
        return bookList.removeIf(bookItem -> bookItem.equals(book));
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        return bookList.stream()
                .filter(book -> book.getId().equals(bookId))
                .findAny();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return bookList.stream()
                .filter(book -> book.getAuthor().equals(author))
                .toList();
    }

    @Override
    public List<Book> findByTitle(String title) {
        return bookList.stream()
                .filter(book -> book.getTitle().equals(title))
                .toList();
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        bookList.removeIf(book -> book.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) {
        bookList.removeIf(book -> book.getTitle().equals(title));
    }
}
