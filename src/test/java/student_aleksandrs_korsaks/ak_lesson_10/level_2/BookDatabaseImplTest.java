package student_aleksandrs_korsaks.ak_lesson_10.level_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookDatabaseImplTest {

    BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

    @BeforeEach
    void setUp() {
        Book bookOne = new Book("A1", "B1");
        Book bookTwo = new Book("A1", "B1");
        Book bookThree = new Book("A2", "B2");
        bookDatabase.save(bookOne);
        bookDatabase.save(bookTwo);
        bookDatabase.save(bookThree);
    }

    @Test
    void saveBook() {
        Book testBook = new Book("A3", "B3");
        Long realResult = bookDatabase.save(testBook);
        Book realResultTwo = bookDatabase.getBookList().get(3);
        assertEquals(4L, realResult, "Book Id should be 4");
        assertEquals(testBook, realResultTwo);
    }

    @Test
    void deleteBookByIdPositive() {
        Book bookTest = new Book("A1", "B1");
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
        Book bookTest = new Book("A1", "B1");
        bookTest.setId(1L);
        assertTrue(bookDatabase.getBookList().contains(bookTest));
        assertTrue(bookDatabase.delete(bookTest), "If book exist and deleted, should be TRUE");
        assertFalse(bookDatabase.getBookList().contains(bookTest));
    }

    @Test
    void deleteBookNegative() {
        Book bookTest = new Book("A1", "B1");
        bookTest.setId(4L);
        int beforeTryingToDeleteResult = bookDatabase.getBookList().size();
        assertFalse(bookDatabase.delete(bookTest), "If book dsn`t exist and wsn`t deleted, should be FALSE");
        int afterTryingToDeleteResult = bookDatabase.getBookList().size();
        assertEquals(beforeTryingToDeleteResult, afterTryingToDeleteResult);
    }
}