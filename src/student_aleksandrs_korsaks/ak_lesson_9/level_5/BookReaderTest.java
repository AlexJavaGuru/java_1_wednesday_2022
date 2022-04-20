package student_aleksandrs_korsaks.ak_lesson_9.level_5;

import java.util.ArrayList;
import java.util.List;

class BookReaderTest {

    public static void main(String[] args) {
        BookReaderTest bookReaderTest = new BookReaderTest();
        bookReaderTest.addBookPositiveTest();
        bookReaderTest.addNonUniqueBookNegativeTest();
        bookReaderTest.addBookWithNoAuthorNegativeTest();
        bookReaderTest.addBookWithNoTitleNegativeTest();
        bookReaderTest.deleteBookPositiveTest();
        bookReaderTest.deleteBookNegativeTest();

    }

    public void addBookPositiveTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book bookOne = new Book("John", "Potter");
        boolean realResult1 = bookReader.addBook(bookOne);
        List<Book> realResult = bookReader.getBookList();
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(bookOne);
        checkTestResult("addBookPositiveTest", (realResult1) && (expectedResult.equals(realResult)));

    }

    public void addNonUniqueBookNegativeTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book bookOne = new Book("John", "Potter");
        Book bookTwo = new Book("John1", "Potter");
        Book bookThree = new Book("John1", "Potter");
        boolean realResult1 = bookReader.addBook(bookOne);
        boolean realResult2 = bookReader.addBook(bookTwo);
        boolean realResult3 = bookReader.addBook(bookThree);
        List<Book> realResult = bookReader.getBookList();
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(bookOne);
        expectedResult.add(bookTwo);
        checkTestResult("addNonUniqueBookNegativeTest", (realResult1 && realResult2 && !realResult3) && (expectedResult.equals(realResult)));

    }

    public void addBookWithNoAuthorNegativeTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book bookOne = new Book("John", "Potter");
        Book bookTwo = new Book("", "Potter2");
        boolean realResult1 = bookReader.addBook(bookOne);
        boolean realResult2 = bookReader.addBook(bookTwo);
        List<Book> realResult = bookReader.getBookList();
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(bookOne);
        checkTestResult("addBookWithNoAuthorNegativeTest", (realResult1 && !realResult2) && (expectedResult.equals(realResult)));

    }

    public void addBookWithNoTitleNegativeTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book bookOne = new Book("John", "Potter");
        Book bookTwo = new Book("John2", "");
        boolean realResult1 = bookReader.addBook(bookOne);
        boolean realResult2 = bookReader.addBook(bookTwo);
        List<Book> realResult = bookReader.getBookList();
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(bookOne);
        checkTestResult("addBookWithNoTitleNegativeTest", (realResult1 && !realResult2) && (expectedResult.equals(realResult)));

    }

    public void deleteBookPositiveTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book bookOne = new Book("John", "Potter");
        Book bookTwo = new Book("John2", "Potter2");
        bookReader.addBook(bookOne);
        bookReader.addBook(bookTwo);
        boolean realResult1 = bookReader.deleteBook("Potter2");
        List<Book> realResult = bookReader.getBookList();
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(bookOne);
        checkTestResult("deleteBookPositiveTest", (realResult1) && (expectedResult.equals(realResult)));

    }

    public void deleteBookNegativeTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book bookOne = new Book("John", "Potter");
        Book bookTwo = new Book("John2", "Potter2");
        bookReader.addBook(bookOne);
        bookReader.addBook(bookTwo);
        boolean realResult1 = bookReader.deleteBook("Potter3");
        List<Book> realResult = bookReader.getBookList();
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(bookOne);
        expectedResult.add(bookTwo);
        checkTestResult("deleteBookNegativeTest", (!realResult1) && (expectedResult.equals(realResult)));

    }

    public void checkTestResult(String testName, boolean condition) {
        if (condition) {
            System.out.println("'" + testName + "'" + " test is OK");
        } else {
            System.out.println("'" + testName + "'" + " test is FAIL");
        }
    }
}
