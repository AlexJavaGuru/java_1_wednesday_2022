package student_aleksandr_zuk.lesson_10.level_2_3_4;

import java.util.*;


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
        List<Book> bookByAuthor = new ArrayList<>();
        for (Book book : library) {
            if (book.getAuthor().equals(author)) {
                bookByAuthor.add(book);
            }
        }
        return bookByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> bookByTitle = new ArrayList<>();
        for (Book book : library) {
            if (book.getTitle().equals(title)) {
                bookByTitle.add(book);
            }
        }
        return bookByTitle;
    }

    @Override
    public int countAllBooks() {
        return library.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        library.removeIf(book -> book.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) {
        library.removeIf(book -> book.getTitle().equals(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> bookFind = new ArrayList<>();
        for (Book book : library) {
            if (searchCriteria.match(book)) {
                bookFind.add(book);
            }
        }
        return bookFind;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> uniqueAuthors = new HashSet<>();
        for (Book book : library) {
            uniqueAuthors.add(book.getAuthor());
        }
        return uniqueAuthors;
        }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitles = new HashSet<>();
        for (Book book : library) {
            uniqueTitles.add(book.getTitle());
        }
        return uniqueTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> uniqueBooks = new HashSet<>();
        uniqueBooks.addAll(library);
        return uniqueBooks;
    }

    @Override
    public boolean contains(Book book) {
        return library.contains(book);
    }

    public List<Book> getLibrary() {
        return library;
    }
}

