package student_aleksandrs_jakovenko.lesson_10.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseTest {

    public static void main(String[] args) {

        BookDatabaseTest test = new BookDatabaseTest();
        test.saveTest();
        test.deleteByIdTest1();
        test.deleteByIdTest2();
        test.deleteBookTest1();
        test.deleteBookTest2();
        test.findByIdTest1();
        test.findByIdTest2();
        test.findByAuthor1();
        test.findByAuthor2();
        test.findByTitle1();
        test.findByTitle2();
        test.countBooks1();
        test.countBooks2();
        test.deleteByAuthor1();
        test.deleteByAuthor2();
        test.deleteByTitle1();
        test.deleteByTitle2();
    }

    void saveTest() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("Harry", "Potter");
        Book book2 = new Book("Harry", "Pot");
        Book book3 = new Book("Har", "Pot");
        book.save(book1);
        book.save(book3);
        Long expectedResult = 3L;
        Long actualResult = book.save(book2);
        checkResult(expectedResult, actualResult, "Save book test");
    }

    void deleteByIdTest1() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("Harry", "Potter");
        Book book2 = new Book("Harry", "Pot");
        Book book3 = new Book("Har", "Pot");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        boolean expectedResult = true;
        boolean actualResult = book.delete(1L);
        checkResult(expectedResult, actualResult, "Delete book by ID test1");
    }

    void deleteByIdTest2() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("Harry", "Potter");
        Book book2 = new Book("Harry", "Pot");
        Book book3 = new Book("Har", "Pot");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        boolean expectedResult = false;
        boolean actualResult = book.delete(10L);
        checkResult(expectedResult, actualResult, "Delete book by ID test1");
    }

    void deleteBookTest1() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("Harry", "Potter");
        Book book2 = new Book("Harry", "Pot");
        Book book3 = new Book("Har", "Pot");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        boolean expectedResult = true;
        boolean actualResult = book.delete(book3);
        checkResult(expectedResult, actualResult, "Delete book test1");
    }

    void deleteBookTest2() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("Harry", "Potter");
        Book book2 = new Book("Harry", "Pot");
        Book book3 = new Book("Har", "Pot");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        boolean expectedResult = false;
        book.delete(book3);
        boolean actualResult = book.delete(book3);
        checkResult(expectedResult, actualResult, "Delete book test2");
    }

    void findByIdTest1() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("Harry", "Potter");
        Book book2 = new Book("Harry", "Pot");
        Book book3 = new Book("Har", "Pot");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        Optional expectedResult = Optional.of(book1);
        Optional actualResult = book.findById(1L);
        checkResult(expectedResult, actualResult, "Find book by ID test1");
    }

    void findByIdTest2() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("Harry", "Potter");
        Book book2 = new Book("Harry", "Pot");
        Book book3 = new Book("Har", "Pot");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        Optional expectedResult = Optional.empty();
        Optional actualResult = book.findById(5L);
        checkResult(expectedResult, actualResult, "Find book by ID test2");
    }

    void findByAuthor1() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("Harry", "Potter");
        Book book2 = new Book("Harry", "Pot");
        Book book3 = new Book("Har", "Pot");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book3);
        List<Book> actualResult = book.findByAuthor("Har");
        checkResult(expectedResult, actualResult, "Find book by author test1");
    }

    void findByAuthor2() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("Harry", "Potter");
        Book book2 = new Book("Harry", "Pot");
        Book book3 = new Book("Har", "Pot");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        List<Book> actualResult = book.findByAuthor("Nothing");
        checkResult(expectedResult, actualResult, "Find book by author test2");
    }

    void findByTitle1() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("Harry", "Potter");
        Book book2 = new Book("Harry", "Pott");
        Book book3 = new Book("Har", "Pot");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book3);
        List<Book> actualResult = book.findByTitle("Pot");
        checkResult(expectedResult, actualResult, "Find book by title test1");
    }

    void findByTitle2() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("Harry", "Potter");
        Book book2 = new Book("Harry", "Pott");
        Book book3 = new Book("Har", "Pot");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        List<Book> actualResult = book.findByTitle("Nothing");
        checkResult(expectedResult, actualResult, "Find book by title test2");
    }

    void countBooks1() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("Harry", "Potter");
        Book book2 = new Book("Harry", "Pott");
        Book book3 = new Book("Har", "Pot");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        int expectedResult = 3;
        int actualResult = book.countAllBooks();
        checkResult(expectedResult, actualResult, "Count books test1");
    }

    void countBooks2() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        int expectedResult = 0;
        int actualResult = book.countAllBooks();
        checkResult(expectedResult, actualResult, "Count books test2");
    }

    void deleteByAuthor1() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("Harry", "Potter");
        Book book2 = new Book("Harry", "Pot");
        Book book3 = new Book("Har", "Pot");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        book.deleteByAuthor("Harry");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book3);
        List<Book> actualResult = book.getLibrary();
        checkResult(expectedResult, actualResult, "Delete by author test1");
    }

    void deleteByAuthor2() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("Harry", "Potter");
        Book book2 = new Book("Harry", "Pot");
        Book book3 = new Book("Har", "Pot");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        book.deleteByAuthor("Nothing");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book3);
        List<Book> actualResult = book.getLibrary();
        checkResult(expectedResult, actualResult, "Delete by author test2");
    }

    void deleteByTitle1() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("Harry", "Potter");
        Book book2 = new Book("Harry", "Pot");
        Book book3 = new Book("Har", "Pot");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        book.deleteByTitle("Pot");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        List<Book> actualResult = book.getLibrary();
        checkResult(expectedResult, actualResult, "Delete by title test1");
    }

    void deleteByTitle2() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("Harry", "Potter");
        Book book2 = new Book("Harry", "Pot");
        Book book3 = new Book("Har", "Pot");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        book.deleteByTitle("Noting");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book3);
        List<Book> actualResult = book.getLibrary();
        checkResult(expectedResult, actualResult, "Delete by title test2");
    }

    void checkResult(Long expectedResult, Long actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    void checkResult(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    void checkResult(Optional expectedResult, Optional actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    void checkResult(List<Book> expectedResult, List<Book> actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
