package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5;

import java.util.*;
import java.util.stream.Collectors;

class BookDatabaseImpl implements BookDatabase {

    private Long id = 1L;

    private List<Book> bookList = new ArrayList<>();


    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public Long save(Book book) {
        bookList.add(book);
        book.setId(id++);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        return bookList.removeIf(book -> book.getId().equals(bookId));
    }

    @Override
    public boolean delete(Book book) {
        for (Book bookItem : bookList) {
            if (book.equals(bookItem)) {
                bookList.remove(bookItem);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        return bookList.stream()
                .filter(book -> book.getId().equals(bookId))
                .findAny();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return bookList.stream()
                .filter(book -> book.getAuthor().equals(author))
                .toList();
    }

    @Override
    public List<Book> findByTitle(String title) {
        return bookList.stream()
                .filter(book -> book.getTitle().equals(title))
                .toList();
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        bookList.removeIf(book -> book.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) {
        bookList.removeIf(book -> book.getTitle().equals(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        return bookList.stream()
                .filter(searchCriteria::match)
                .toList();
    }

    @Override
    public Set<String> findUniqueAuthors() {
        return bookList.stream()
                .map(Book::getAuthor)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<String> findUniqueTitles() {
        return bookList.stream()
                .map(Book::getTitle)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(bookList);
    }

    @Override
    public boolean contains(Book book) {
        return bookList.contains(book);
    }

    public Map<String, List<Book>> getAuthorToBooksMap() {
        return bookList.stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
    }

//    @Override
//    public Map<String, List<Book>> getAuthorToBooksMap() {
//        Map<String, List<Book>> authorBooks = new HashMap<>();
//        Set<String> uniqueAuthors;
//        uniqueAuthors = findUniqueAuthors();
//        for (String uniqueAuthor : uniqueAuthors) {
//            List<Book> books = new ArrayList<>();
//            for (Book book : bookList) {
//                if (book.getAuthor().equals(uniqueAuthor)) {
//                    books.add(book);
//                }
//            }
//            authorBooks.put(uniqueAuthor, books);
//        }
//        return authorBooks;
//    }
}
