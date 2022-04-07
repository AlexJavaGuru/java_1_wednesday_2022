package student_aleksandrs_jakovenko.lesson_10.level_2_3_4;

import java.util.*;

class BookDatabaseImpl implements BookDatabase {

    private List<Book> library = new ArrayList<>();
    private Long id = 1L;

    public List<Book> getLibrary() {
        return library;
    }

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
        if (library.contains(book)) {
            library.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : library) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : library) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> booksByTitle = new ArrayList<>();
        for (Book book : library) {
            if (book.getTitle().equals(title)) {
                booksByTitle.add(book);
            }
        }
        return booksByTitle;
    }

    @Override
    public int countAllBooks() {
        return library.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        library.removeIf(book -> book.getAuthor().equals(author));
    } //идея сама переделала мой метод)

    @Override
    public void deleteByTitle(String title) {
        library.removeIf(book -> book.getTitle().equals(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> booksFind = new ArrayList<>();
        for (Book book : library) {
            if (searchCriteria.match(book)){
                booksFind.add(book);
            }
        }
        return booksFind;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> authors = new HashSet<>();
        for (Book book : library) {
            authors.add(book.getAuthor());
        }
        return authors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> titles = new HashSet<>();
        for (Book book : library) {
            titles.add(book.getTitle());
        }
        return titles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> books = new HashSet<>();
        books.addAll(library);
        return books;
    }

    @Override
    public boolean contains(Book book) {
        return library.contains(book);
    }
}
