package student_aleksandrs_jakovenko.lesson_10.level_2;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {

    private List<Book> library = new ArrayList<>();
    private Long id = 1L;

    @Override
    public Long save(Book book) {
        library.add(book);
        book.setId(id++);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : library) {
            if (bookId.equals(book.getId())) {
                library.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        if (library.contains(book)){
            library.remove(book);
            return true;
        }
        return false;
    }
}
