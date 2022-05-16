package student_aleksandrs_korsaks.ak_lesson_10.level_2;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {

    Long id = 1L;
    List<Book> bookList = new ArrayList<>();

    @Override
    public Long save(Book book) {
        bookList.add(book);
        book.setId(id++);
        return book.getId();
    }
}
