package student_arturs_melnikovs.lesson_10.level_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {

    private List<Book> myBooks = new ArrayList<>();
    private Long id = 0L;

    public List<Book> getMyBooks() {
        return myBooks;
    }

    @Override
    public Long save(Book book) {
        if(myBooks.contains(book)) {
            return -1L;
        } else {
            myBooks.add(book);
            book.setId(++id);
        }
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

    @Override
    public boolean delete(Book book) {
        if (myBooks.contains(book)) {
            myBooks.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : myBooks) {
            if (book.getId().equals(bookId)){
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> authorsBooks = new ArrayList<>();
        for (Book book : myBooks) {
            if (book.getAuthor().equals(author)) {
                authorsBooks.add(book);
            }
        }
        return authorsBooks;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> titleBooks = new ArrayList<>();
        for (Book book : myBooks) {
            if (book.getTitle().equals(title)) {
                titleBooks.add(book);
            }
        }
        return titleBooks;
    }

    @Override
    public int countAllBooks() {
        return myBooks.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> temp = new ArrayList<>();
        for (Book book : myBooks) {
            if (book.getAuthor().equals(author)) {
                temp.add(book);
            }
        }
        myBooks.removeAll(temp);
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> temp = new ArrayList<>();
        for (Book book : myBooks) {
            if (book.getTitle().equals(title)) {
                temp.add(book);
            }
        }
        myBooks.removeAll(temp);
    }
}
