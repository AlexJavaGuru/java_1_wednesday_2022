package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BookDatabaseImplTest {

    BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

    @BeforeEach
    void setUp() {
        Book bookOne = new Book("A1", "B1","1990");
        Book bookTwo = new Book("A1", "B1","1990");
        Book bookThree = new Book("A2", "B2","1990");
        bookDatabase.save(bookOne);
        bookDatabase.save(bookTwo);
        bookDatabase.save(bookThree);
    }

    @Test
    void saveBook() {
        Book testBook = new Book("A3", "B3","1990");
        Long realResult = bookDatabase.save(testBook);
        Book realResultTwo = bookDatabase.getBookList().get(3);
        assertEquals(4L, realResult, "Book Id should be 4");
        assertEquals(testBook, realResultTwo);
    }

    @Test
    void deleteBookByIdPositive() {
        Book bookTest = new Book("A1", "B1","1990");
        bookTest.setId(1L);
        assertTrue(bookDatabase.getBookList().contains(bookTest));
        assertTrue(bookDatabase.delete(1L), "If book with that ID exist and deleted, should be TRUE");
        assertFalse(bookDatabase.getBookList().contains(bookTest));
    }

    @Test
    void deleteBookByIdNegative() {
        int beforeTryingToDeleteResult = bookDatabase.getBookList().size();
        assertFalse(bookDatabase.delete(4L), "If book with that ID dsn`t exist and wsn`t deleted, should be FALSE");
        int afterTryingToDeleteResult = bookDatabase.getBookList().size();
        assertEquals(beforeTryingToDeleteResult, afterTryingToDeleteResult);
    }

    @Test
    void deleteBookPositive() {
        Book bookTest = new Book("A1", "B1","1990");
        bookTest.setId(1L);
        assertTrue(bookDatabase.getBookList().contains(bookTest));
        assertTrue(bookDatabase.delete(bookTest), "If book exist and deleted, should be TRUE");
        assertFalse(bookDatabase.getBookList().contains(bookTest));
    }

    @Test
    void deleteBookNegative() {
        Book bookTest = new Book("A1", "B1","1990");
        bookTest.setId(4L);
        int beforeTryingToDeleteResult = bookDatabase.getBookList().size();
        assertFalse(bookDatabase.delete(bookTest), "If book dsn`t exist and wsn`t deleted, should be FALSE");
        int afterTryingToDeleteResult = bookDatabase.getBookList().size();
        assertEquals(beforeTryingToDeleteResult, afterTryingToDeleteResult);
    }

    @Test
    void findByIdPositive() {
        Book bookTest = new Book("A1", "B1","1990");
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
        Book bookOneTest = new Book("A1", "B1","1990");
        bookOneTest.setId(1L);
        Book bookTwoTest = new Book("A1", "B1","1990");
        bookTwoTest.setId(2L);
        assertEquals(3, bookDatabase.getBookList().size());
        assertTrue(bookDatabase.getBookList().contains(bookOneTest));
        assertTrue(bookDatabase.getBookList().contains(bookTwoTest));
        bookDatabase.deleteByAuthor("A1");
        assertFalse(bookDatabase.getBookList().contains(bookOneTest));
        assertFalse(bookDatabase.getBookList().contains(bookTwoTest));
        assertEquals(1, bookDatabase.getBookList().size());
    }

    @Test
    void deleteByAuthorNegative() {
        int beforeTryingToDeleteResult = bookDatabase.getBookList().size();
        bookDatabase.deleteByAuthor("A3");
        int afterTryingToDeleteResult = bookDatabase.getBookList().size();
        assertEquals(beforeTryingToDeleteResult, afterTryingToDeleteResult);
    }

    @Test
    void deleteByTitlePositive() {
        Book bookOneTest = new Book("A1", "B1","1990");
        bookOneTest.setId(1L);
        Book bookTwoTest = new Book("A1", "B1","1990");
        bookTwoTest.setId(2L);
        assertEquals(3, bookDatabase.getBookList().size());
        assertTrue(bookDatabase.getBookList().contains(bookOneTest));
        assertTrue(bookDatabase.getBookList().contains(bookTwoTest));
        bookDatabase.deleteByTitle("B1");
        assertFalse(bookDatabase.getBookList().contains(bookOneTest));
        assertFalse(bookDatabase.getBookList().contains(bookTwoTest));
        assertEquals(1, bookDatabase.getBookList().size());
    }

    @Test
    void deleteByTitleNegative() {
        int beforeTryingToDeleteResult = bookDatabase.getBookList().size();
        bookDatabase.deleteByTitle("B3");
        int afterTryingToDeleteResult = bookDatabase.getBookList().size();
        assertEquals(beforeTryingToDeleteResult, afterTryingToDeleteResult);
    }

    @Test
    void findPositive() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A1");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("B2");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        List<Book> test = new ArrayList<>();
        Book bookOne = new Book("A1", "B1","1990");
        bookOne.setId(1L);
        Book bookTwo = new Book("A1", "B1","1990");
        bookTwo.setId(2L);
        Book bookThree = new Book("A2", "B2","1990");
        bookThree.setId(3L);
        test.add(bookOne);
        test.add(bookTwo);
        test.add(bookThree);
        assertEquals(bookDatabase.find(orSearchCriteria), test);
        test.remove(bookThree);
        assertEquals(bookDatabase.find(authorSearchCriteria), test);
        test.remove(bookOne);
        test.remove(bookTwo);
        assertEquals(bookDatabase.find(andSearchCriteria), test);
        test.add(bookThree);
        assertEquals(bookDatabase.find(titleSearchCriteria), test);

    }
}