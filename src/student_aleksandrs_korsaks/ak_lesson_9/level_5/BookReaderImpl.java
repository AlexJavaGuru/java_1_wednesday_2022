package student_aleksandrs_korsaks.ak_lesson_9.level_5;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    private List<Book> bookList = new ArrayList<>();

    @Override
    public boolean addBook(Book bookToAdd) {
        if (isBookUnique(bookToAdd)) {
            bookList.add(bookToAdd);
            return true;
        }
        return false;
    }

    boolean isBookUnique(Book bookToCheck) {
        for (Book book : bookList) {
            if (book.equals(bookToCheck)) {
                return false;
            }
        }
        return true;
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
