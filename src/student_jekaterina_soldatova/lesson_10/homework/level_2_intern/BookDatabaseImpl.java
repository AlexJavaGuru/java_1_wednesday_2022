package student_jekaterina_soldatova.lesson_10.homework.level_2_intern;

import java.util.LinkedList;
import java.util.List;

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

}
