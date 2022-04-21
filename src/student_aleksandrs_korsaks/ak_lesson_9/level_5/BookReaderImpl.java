package student_aleksandrs_korsaks.ak_lesson_9.level_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class BookReaderImpl implements BookReader {

    private List<Book> bookList = new ArrayList<>();

    boolean isBookUnique(Book bookToCheck) {
        for (Book book : bookList) {
            if (book.equals(bookToCheck)) {
                return false;
            }
        }
        return true;
    }

    boolean isBookValid(Book bookToCheck) {
        return !(bookToCheck.getBookAuthor().isEmpty() || bookToCheck.getBookTitle().isEmpty());
    }

    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public List<String> getBookListInString() {
        return bookList.stream()
                .map(object -> Objects.toString(object, null))
                .collect(Collectors.toList());
    }

    @Override
    public boolean addBook(Book bookToAdd) {
        if (isBookUnique(bookToAdd) && isBookValid(bookToAdd)) {
            bookList.add(bookToAdd);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteBook(String bookTitleToDelete) {
        for (Book book : bookList) {
            if (book.getBookTitle().equalsIgnoreCase(bookTitleToDelete)) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }
}
