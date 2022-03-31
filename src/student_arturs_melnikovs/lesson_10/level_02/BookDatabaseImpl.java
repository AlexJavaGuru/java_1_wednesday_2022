package student_arturs_melnikovs.lesson_10.level_02;

import java.util.ArrayList;
import java.util.List;

class BookDatabaseImpl implements BookDatabase {

    private List<Book> myBooks = new ArrayList<>();
    private Long id = 0L;

    @Override
    public Long save(Book book) {
        myBooks.add(book);
        book.setId(++id);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : myBooks) {
            if (book.getId().equals(bookId)){
                myBooks.remove(book);
                return true;
            }
        }
        return false;
    }
}
