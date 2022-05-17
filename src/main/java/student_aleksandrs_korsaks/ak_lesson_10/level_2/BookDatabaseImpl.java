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
}
