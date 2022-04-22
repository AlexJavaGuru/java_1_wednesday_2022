package student_aleksandrs_korsaks.ak_lesson_9.level_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class BookReaderImpl implements BookReader {

    private List<Book> bookList = new ArrayList<>();
    private boolean flagAtLeastOneBookChecked;
    private boolean flagAtLeastOneBookUnchecked;

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

    public List<String> getBookListInString(List<Book> listOfBooks) {
        return listOfBooks.stream().map(object -> Objects.toString(object, null)).collect(Collectors.toList());
    }

    @Override
    public List<String> getBookListInString() {
        return bookList.stream().map(object -> Objects.toString(object, null)).collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooksOfAuthor(String authorName) {
        List<Book> foundedBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getBookAuthor().startsWith(authorName)) {
                foundedBooks.add(book);
            }
        }
        return foundedBooks;
    }

    @Override
    public List<Book> getAllBooksOfTitle(String bookTitle) {
        List<Book> foundedBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getBookTitle().startsWith(bookTitle)) {
                foundedBooks.add(book);
            }
        }
        return foundedBooks;
    }

    @Override
    public List<String> getAllReadenBooks() {
        List<Book> foundedBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (book.isReaden()) {
                foundedBooks.add(book);
            }
        }
        return getBookListInString(foundedBooks);
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

    @Override
    public boolean checkBookAsReaden(String bookTitleToCheck) {
        for (Book book : bookList) {
            if (book.getBookTitle().equalsIgnoreCase(bookTitleToCheck)) {
                book.setReaden(true);
                flagAtLeastOneBookChecked = true;
            }
        }
        return flagAtLeastOneBookChecked;
    }

    @Override
    public boolean uncheckBookAsReaden(String bookTitleToUncheck) {
        for (Book book : bookList) {
            if (book.getBookTitle().equalsIgnoreCase(bookTitleToUncheck)) {
                book.setReaden(false);
                flagAtLeastOneBookUnchecked = true;
            }
        }
        return flagAtLeastOneBookUnchecked;
    }
}
