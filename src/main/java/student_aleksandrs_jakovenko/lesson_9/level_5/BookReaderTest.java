package student_aleksandrs_jakovenko.lesson_9.level_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BookReaderTest {

    public static void main(String[] args) {

        BookReaderTest test = new BookReaderTest();
        test.addBookTest1();
        test.addBookTest2();
        test.addBookTest3();
        test.addBookTest4();
        test.deleteBookTest1();
        test.deleteBookTest2();
        test.printBookTest();
        test.findByAuthorTest1();
        test.findByAuthorTest2();
        test.findByAuthorTest3();
        test.findByBookNameTest1();
        test.findByBookNameTest2();
        test.findByBookNameTest3();
    }

    public void addBookTest1() {
        BookReader book = new BookReaderImpl();
        Book test = new Book("Harry", "Potter");
        boolean actualResult = book.addBook(test);
        boolean expectedResult = true;
        checkResult(actualResult, expectedResult, "Add book test1");
    }

    public void addBookTest2() {
        BookReader book = new BookReaderImpl();
        Book test1 = new Book("Harry1", "Potter1");
        book.addBook(test1);
        Book test2 = new Book("Harry", "Potter");
        boolean actualResult = book.addBook(test2);
        boolean expectedResult = true;
        checkResult(actualResult, expectedResult, "Add book test2");
    }

    public void addBookTest3() {
        BookReader book = new BookReaderImpl();
        Book test = new Book("Harry", "Potter");
        book.addBook(test);
        boolean actualResult = book.addBook(test);
        boolean expectedResult = false;
        checkResult(actualResult, expectedResult, "Add book test3");
    }

    public void addBookTest4() {
        BookReader book = new BookReaderImpl();
        Book test = new Book("Harry", "");
        boolean actualResult = book.addBook(test);
        boolean expectedResult = false;
        checkResult(actualResult, expectedResult, "Add book test4");
    }

    public void deleteBookTest1() {
        BookReader book = new BookReaderImpl();
        Book test = new Book("Harry", "Potter");
        book.addBook(test);
        boolean actualResult = book.deleteBook(test);
        boolean expectedResult = true;
        checkResult(actualResult, expectedResult, "Delete book test1");
    }

    public void deleteBookTest2() {
        BookReader book = new BookReaderImpl();
        Book test1 = new Book("Harry1", "Potter1");
        book.addBook(test1);
        Book test2 = new Book("Harry", "Potter");
        boolean actualResult = book.deleteBook(test2);
        boolean expectedResult = false;
        checkResult(actualResult, expectedResult, "Delete book test2");
    }

    public void printBookTest() {
        BookReader book = new BookReaderImpl();
        Book test1 = new Book("Harry1", "Potter1");
        book.addBook(test1);
        Book test2 = new Book("Harry", "Potter");
        book.addBook(test2);
        String[] expectedResult = {"Harry1 [Potter1]", "Harry [Potter]"};
        String[] actualResult = book.printBooks();
        checkResult(actualResult, expectedResult, "Print books test");
    }

    public void findByAuthorTest1() {
        BookReader book = new BookReaderImpl();
        Book test1 = new Book("Harry", "Harry");
        Book test2 = new Book("Harry1", "Potter");
        Book test3 = new Book("Harry2", "Potter");
        book.addBook(test1);
        book.addBook(test2);
        book.addBook(test3);
        List<Book> expectedResult = new ArrayList<>() {{
            add(test2);
            add(test3);
        }};
        List<Book> actualResult = book.findByAuthor("Potter");
        checkResult(actualResult, expectedResult, "FindByAuthor test1");
    }

    public void findByAuthorTest2() {
        BookReader book = new BookReaderImpl();
        Book test1 = new Book("Harry", "Potter");
        Book test2 = new Book("Harry1", "Potter");
        Book test3 = new Book("Harry2", "Potter");
        book.addBook(test1);
        book.addBook(test2);
        book.addBook(test3);
        List<Book> expectedResult = new ArrayList<>();
        List<Book> actualResult = book.findByAuthor("harry");
        checkResult(actualResult, expectedResult, "FindByAuthor test2");
    }

    public void findByAuthorTest3() {
        BookReader book = new BookReaderImpl();
        Book test1 = new Book("Harry", "Potter");
        Book test2 = new Book("Harry1", "Potter");
        Book test3 = new Book("Harry2", "Potter");
        book.addBook(test1);
        book.addBook(test2);
        book.addBook(test3);
        List<Book> expectedResult = new ArrayList<>() {{
            add(test1);
            add(test2);
            add(test3);
        }};
        List<Book> actualResult = book.findByAuthor("Pott");
        checkResult(actualResult, expectedResult, "FindByAuthor test3");
    }

    public void findByBookNameTest1() {
        BookReader book = new BookReaderImpl();
        Book test1 = new Book("Harry", "Potter");
        Book test2 = new Book("Harry", "Potter1");
        Book test3 = new Book("Harry1", "Potter");
        book.addBook(test1);
        book.addBook(test2);
        book.addBook(test3);
        List<Book> expectedResult = new ArrayList<>() {{
            add(test1);
            add(test2);
            add(test3);
        }};
        List<Book> actualResult = book.findByBookName("Harry");
        checkResult(actualResult, expectedResult, "FindByBookName test1");
    }

    public void findByBookNameTest2() {
        BookReader book = new BookReaderImpl();
        Book test1 = new Book("Harry", "Potter");
        Book test2 = new Book("Harry", "Potter1");
        Book test3 = new Book("Harry1", "Potter");
        book.addBook(test1);
        book.addBook(test2);
        book.addBook(test3);
        List<Book> expectedResult = new ArrayList<>();
        List<Book> actualResult = book.findByBookName("Potter");
        checkResult(actualResult, expectedResult, "FindByBookName test2");
    }

    public void findByBookNameTest3() {
        BookReader book = new BookReaderImpl();
        Book test1 = new Book("Harry", "Potter");
        Book test2 = new Book("Harry", "Potter1");
        Book test3 = new Book("Harry1", "Potter");
        book.addBook(test1);
        book.addBook(test2);
        book.addBook(test3);
        List<Book> expectedResult = new ArrayList<>() {{
            add(test1);
            add(test2);
            add(test3);
        }};
        List<Book> actualResult = book.findByBookName("Har");
        checkResult(actualResult, expectedResult, "FindByBookName test3");
    }

    public void checkResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void checkResult(String[] actualResult, String[] expectedResult, String testName) {
        if (Arrays.equals(actualResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void checkResult(List<Book> actualResult, List<Book> expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
