package student_aleksandr_zuk.lesson_10.level_2_3_4;

import java.util.*;

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
        test.countBooks();
        test.deleteByAuthor1();
        test.deleteByAuthor2();
        test.deleteByTitle1();
        test.deleteByTitle2();
        test.uniqueAuthor();
        test.containsBook1();
        test.containsBook2();
    }

    void saveTest() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book3);
        Long expectedResult = 3L;
        Long actualResult = book.save(book2);
        checkResult(expectedResult, actualResult, "Save book test");
    }

    void deleteByIdTest1() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        boolean expectedResult = true;
        boolean actualResult = book.delete(1L);
        checkResult(expectedResult, actualResult, "Delete book by id test1");
    }

    void deleteByIdTest2() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        boolean expectedResult = false;
        boolean actualResult = book.delete(10L);
        checkResult(expectedResult, actualResult, "Delete book by id test2");
    }

    void deleteBookTest1() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        boolean expectedResult = true;
        boolean actualResult = book.delete(book3);
        checkResult(expectedResult, actualResult, "Delete book test1");
    }

    void deleteBookTest2() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
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
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        Optional expectedResult = Optional.of(book1);
        Optional actualResult = book.findById(1L);
        checkResult(expectedResult, actualResult, "Find book by id test 1");
    }

    void findByIdTest2() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        Optional expectedResult = Optional.empty();
        Optional actualResult = book.findById(4L);
        checkResult(expectedResult, actualResult, "Find book by id test 2");
    }

    void findByAuthor1() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book3);
        List<Book> actualResult = book.findByAuthor("Joh");
        checkResult(expectedResult, actualResult, "Find book by author test 1");
    }

    void findByAuthor2() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        List<Book> actualResult = book.findByAuthor("Zero");
        checkResult(expectedResult, actualResult, "Find book by author test 2");
    }

    void findByTitle1() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book3);
        List<Book> actualResult = book.findByTitle("Wic");
        checkResult(expectedResult, actualResult, "Find book by title test 1");
    }

    void findByTitle2() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        List<Book> actualResult = book.findByTitle("Zero");
        checkResult(expectedResult, actualResult, "Find book by title test 2");
    }

    void countBooks() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        int expectedResult = 3;
        int actualResult = book.countAllBooks();
        checkResult(expectedResult, actualResult, "Count books test");
    }

    void deleteByAuthor1() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        book.deleteByAuthor("John");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book3);
        List<Book> actualResult = book.getLibrary();
        checkResult(expectedResult, actualResult, "Delete by author test 1");
    }

    void deleteByAuthor2() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book3);
        expectedResult.add(book2);
        expectedResult.add(book1);
        List<Book> actualResult = book.getLibrary();
        checkResult(expectedResult, actualResult, "Delete by author test 1");
    }

    void deleteByTitle1() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        book.deleteByAuthor("Wic");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        List<Book> actualResult = book.getLibrary();
        checkResult(expectedResult, actualResult, "Delete by title test 1");
    }

    void deleteByTitle2() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        book.deleteByTitle("Zero");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book3);
        expectedResult.add(book2);
        expectedResult.add(book1);
        List<Book> actualResult = book.getLibrary();
        checkResult(expectedResult, actualResult, "Delete by title test 2");
    }

    void uniqueAuthor() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("John");
        expectedResult.add("Joh");
        Set<String> actualResult = book.findUniqueAuthors();
        checkResult(expectedResult, actualResult, "Unique author test");
    }

    void containsBook1() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        boolean expectedResult = true;
        boolean actualResult = book.contains(book1);
        checkResult(expectedResult, actualResult, "Contains book test 1");
    }

    void containsBook2() {
        BookDatabaseImpl book = new BookDatabaseImpl();
        Book book1 = new Book("John", "Wick");
        Book book2 = new Book("John", "Wic");
        Book book3 = new Book("Joh", "Wic");
        book.save(book1);
        book.save(book2);
        book.save(book3);
        book.delete(book1);
        boolean expectedResult = false;
        boolean actualResult = book.contains(book1);
        checkResult(expectedResult, actualResult, "Contains book test 2");
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
        if (expectedResult == actualResult) {
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

    void checkResult(Set<String> expectedResult, Set<String> actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
