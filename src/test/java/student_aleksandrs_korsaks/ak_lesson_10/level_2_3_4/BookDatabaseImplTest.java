package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookDatabaseImplTest {

    BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

    @BeforeEach
    void setUp() {
        Book bookOne = new Book("A1", "B1", "1990");
        bookDatabase.save(bookOne); // bookOne ID are set to 1L and added to collection

        Book bookTwo = new Book("A1", "B1", "1990");
        bookDatabase.save(bookTwo);// bookTwo ID are set to 2L and added to collection

//  bookOne is equal bookTwo, despite bookID`s are different
//  because bookId not included in equal() and hash() and all rest fields are same

        Book bookThree = new Book("A2", "B2", "1990");
        bookDatabase.save(bookThree);// bookThree ID are set to 3L and added to collection
    }

    @Test
    void saveBook() {
        Book testBook = new Book("A3", "B3", "1990");
        Long realResultForBookId = bookDatabase.save(testBook);
        Book realResultForBook = bookDatabase.getBookList().get(3);
        assertEquals(4L, realResultForBookId, "Book Id should be 4");
        assertEquals(testBook, realResultForBook);
    }

    @Test
    void deleteBookByIdPositive() {
        assertTrue(bookDatabase.delete(1L), "If book with that ID exist and have been deleted, should return TRUE");
        boolean realResult = bookDatabase.getBookList().stream()
                .anyMatch(book -> book.getId() == 1L);
        assertFalse(realResult);
        assertEquals(2, bookDatabase.getBookList().size());
    }

    @Test
    void deleteBookByIdNegative() {
        assertFalse(bookDatabase.delete(4L), "If book with that ID dsn`t exist and haven’t been deleted, should return FALSE");
    }

    @Test
    void deleteBookPositive() {
        Book bookTest = new Book("A1", "B1", "1990");

        assertTrue(bookDatabase.delete(bookTest), "If book exist and have been deleted, should return TRUE");

        int realResultAfterDeleting = bookDatabase.getBookList().stream()
                .filter(book -> book.equals(bookTest))
                .toList().size();

        assertEquals(1, realResultAfterDeleting);
    }

    @Test
    void deleteBookNegative() {
        Book bookTest = new Book("A1", "B1", "1991");
        assertFalse(bookDatabase.delete(bookTest), "If book dsn`t exist and haven’t been deleted, should be FALSE");
        int afterTryingToDeleteResult = bookDatabase.getBookList().size();
        assertEquals(3, afterTryingToDeleteResult);
    }

    @Test
    void findByIdPositive() {
        Book bookTest = new Book("A1", "B1", "1990");
        bookTest.setId(1L);
        Optional<Book> expectedResult = Optional.of(bookTest);
        assertEquals(expectedResult, bookDatabase.findById(1L));
    }

    @Test
    void findByIdNegative() {
        assertEquals(Optional.empty(), bookDatabase.findById(5L));
    }

    @Test
    void findByAuthorPositive() {
        List<Book> realResult = bookDatabase.findByAuthor("A1");
        bookDatabase.delete(3L);
        assertEquals(bookDatabase.getBookList(), realResult);
    }

    @Test
    void findByAuthorNegative() {
        List<Book> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, bookDatabase.findByAuthor("A3"));
    }


    @Test
    void findByTitlePositive() {
        List<Book> realResult = bookDatabase.findByTitle("B1");
        bookDatabase.delete(3L);
        assertEquals(bookDatabase.getBookList(), realResult);
    }

    @Test
    void findByTitleNegative() {
        List<Book> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, bookDatabase.findByAuthor("B3"));
    }

    @Test
    void countAllBooks() {
        assertEquals(3, bookDatabase.countAllBooks());
    }

    @Test
    void deleteByAuthorPositive() {
        bookDatabase.deleteByAuthor("A1");
        boolean realResult = bookDatabase.getBookList().stream()
                .anyMatch(book -> book.getAuthor().equals("A1"));
        assertFalse(realResult);
        assertEquals(1, bookDatabase.getBookList().size());
    }

    @Test
    void deleteByAuthorNegative() {
        bookDatabase.deleteByAuthor("A3");
        assertEquals(3, bookDatabase.getBookList().size());
    }

    @Test
    void deleteByTitlePositive() {
        bookDatabase.deleteByTitle("B1");
        boolean realResult = bookDatabase.getBookList().stream()
                .anyMatch(book -> book.getTitle().equals("B1"));
        assertFalse(realResult);
        assertEquals(1, bookDatabase.getBookList().size());
    }

    @Test
    void deleteByTitleNegative() {
        bookDatabase.deleteByTitle("B3");
        assertEquals(3, bookDatabase.getBookList().size());
    }

    @Test
    void findUniqueAuthors() {
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("A1");
        expectedResult.add("A2");
        assertEquals(expectedResult, bookDatabase.findUniqueAuthors());
    }

    @Test
    void findUniqueTitles() {
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("B1");
        expectedResult.add("B2");
        assertEquals(expectedResult, bookDatabase.findUniqueTitles());
    }

    @Test
    void findUniqueBooks() {
        Book bookOneTest = new Book("A1", "B1", "1990");
        Book bookTwoTest = new Book("A2", "B2", "1990");
        Set<Book> expectedResult = new HashSet<>();
        expectedResult.add(bookOneTest);
        expectedResult.add(bookTwoTest);
        assertEquals(expectedResult, bookDatabase.findUniqueBooks());
    }

    @Test
    void containsPositive() {
        Book bookOneTest = new Book("A1", "B1", "1990");
        assertTrue(bookDatabase.contains(bookOneTest));
    }

    @Test
    void containsNegative() {
        Book bookOneTest = new Book("A2", "B1", "1990");
        assertFalse(bookDatabase.contains(bookOneTest));
    }
}