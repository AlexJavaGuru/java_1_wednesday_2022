package student_arturs_melnikovs.lesson_10.level_02;

import student_arturs_melnikovs.lesson_10.level_03.SearchCriteria;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase {

    private final List<Book> myBooks = new ArrayList<>();
    private Long id = 0L;

    public List<Book> getMyBooks() {
        return myBooks;
    }

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

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> searchedBooks = new ArrayList<>();
        for (Book book : myBooks) {
            if (searchCriteria.match(book)) {
                searchedBooks.add(book);
            }
        }
        return searchedBooks;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> uniqueAuthors = new HashSet<>();
        for (Book book : myBooks) {
            uniqueAuthors.add(book.getAuthor());
        }
        return uniqueAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitle = new HashSet<>();
        for (Book book : myBooks) {
            uniqueTitle.add(book.getTitle());
        }
        return uniqueTitle;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(myBooks);
    }

    @Override
    public boolean contains(Book book) {
        return myBooks.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Set<String> authors = findUniqueAuthors();
        Map<String, List<Book>> map = new HashMap<>();

        for (String author : authors) {
            List<Book> authorsBooks = new ArrayList<>();
            for (Book book : myBooks) {
                if (book.getAuthor().equals(author)) {
                    authorsBooks.add(book);
                }
            }
            map.put(author, authorsBooks);
        }

        return map;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Set<String> authors = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        for (Book book : myBooks) {
            authors.add(book.getAuthor());
        }
        for (String author : authors) {
            int count = 0;
            for (Book book : myBooks) {
                if (book.getAuthor().equals(author)) {
                    count++;
                }
            }
            map.put(author, count);
        }

        return map;
    }
}
