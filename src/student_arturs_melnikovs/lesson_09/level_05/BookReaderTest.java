package student_arturs_melnikovs.lesson_09.level_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class BookReaderTest {
    public static void main(String[] args) {
        BookReaderTest tester = new BookReaderTest();
        tester.testAddBook1();
        tester.testAddBook2();
        tester.testAddBook3();
        tester.testAddBook4();
        tester.testAddBook5();
        tester.testAddBook6();
        tester.testDeleteBook1();
        tester.testDeleteBook2();
        tester.testGetListOfAllBooks();
        tester.testFindByAuthor();
        tester.testFindByAuthor2();
        tester.testFindByAuthor3();
    }

    public void testFindByAuthor() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Lord Of The Ring", "Tolkien");
        Book lordOfRings2 = new Book("Lord Of The Ring 2", "Tolkien");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings);
        bookReader.addBook(lordOfRings2);
        List<Book> expectedResult = new ArrayList<>() {{add(lordOfRings); add(lordOfRings2);}};
        List<Book> actualResult = bookReader.findByAuthor("Tolkien");
        checkResult(expectedResult, actualResult);
    }
    public void testFindByAuthor2() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Lord Of The Ring", "Tolkien");
        Book lordOfRings2 = new Book("Lord Of The Ring 2", "Tolkien");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings);
        bookReader.addBook(lordOfRings2);
        List<Book> expectedResult = new ArrayList<>();
        List<Book> actualResult = bookReader.findByAuthor("olkien");
        checkResult(expectedResult, actualResult);
    }
    public void testFindByAuthor3() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Lord Of The Ring", "Tolkien");
        Book lordOfRings2 = new Book("Lord Of The Ring 2", "Tolkien");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings);
        bookReader.addBook(lordOfRings2);
        List<Book> expectedResult = new ArrayList<>() {{add(lordOfRings); add(lordOfRings2);}};
        List<Book> actualResult = bookReader.findByAuthor("Tolk");
        checkResult(expectedResult, actualResult);
    }
    public void testGetListOfAllBooks() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Lord Of The Ring", "Tolkien");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings);
        String[] expectedResult = {"Harry Potter [Rowling]", "Lord Of The Ring [Tolkien]"};
        String[] actualResult = bookReader.getListOfAllBooks();
        checkResult(expectedResult, actualResult);
    }
    public void testDeleteBook1() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        bookReader.addBook(harryPotter);
        boolean actualResult = bookReader.deleteBook(harryPotter);
        checkResult(actualResult);
    }
    public void testDeleteBook2() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        boolean actualResult = bookReader.deleteBook(harryPotter);
        checkResult(!actualResult);
    }
    public void testAddBook1() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        boolean actualResult = bookReader.addBook(harryPotter);
        checkResult(actualResult);
    }
    public void testAddBook2() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        bookReader.addBook(harryPotter);
        boolean actualResult = bookReader.addBook(harryPotter);
        checkResult(!actualResult);
    }
    public void testAddBook3() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book();
        boolean actualResult = bookReader.addBook(harryPotter);
        checkResult(!actualResult);
    }
    public void testAddBook4() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book();
        harryPotter.setAuthor("Rowling");
        boolean actualResult = bookReader.addBook(harryPotter);
        checkResult(!actualResult);
    }
    public void testAddBook5() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book();
        harryPotter.setTitle("Harry Potter");
        boolean actualResult = bookReader.addBook(harryPotter);
        checkResult(!actualResult);
    }
    public void testAddBook6() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book();
        harryPotter.setTitle("Harry Potter");
        harryPotter.setAuthor("Rowling");
        boolean actualResult = bookReader.addBook(harryPotter);
        checkResult(actualResult);
    }

    private void checkResult(boolean actualResult) {
        if (actualResult) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has failed");
        }
    }
    private void checkResult(String[] expectedResult, String[] actualResult) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has failed");
        }
    }
    private void checkResult(List<Book> expectedResult, List<Book> actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has failed");
        }
    }

}
