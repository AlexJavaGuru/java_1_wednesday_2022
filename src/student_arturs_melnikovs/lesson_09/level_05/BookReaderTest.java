package student_arturs_melnikovs.lesson_09.level_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        tester.testFindByTitle1();
        tester.testFindByTitle2();
        tester.testFindByTitle3();
        tester.testMarkAsRead1();
        tester.testMarkAsRead2();
        tester.testMarkAsUnread1();
        tester.testMarkAsUnread2();
        tester.testGetAllReadBooks1();
        tester.testGetAllReadBooks2();
        tester.testGetAllUnreadBooks1();
        tester.testGetAllUnreadBooks2();
    }

    public void testGetAllUnreadBooks1() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Lord Of The Ring", "Tolkien");
        Book lordOfRings2 = new Book("Lord Of The Ring 2", "Tolkien");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings);
        bookReader.addBook(lordOfRings2);
        bookReader.markAsUnread(lordOfRings);
        bookReader.markAsUnread(lordOfRings2);
        List<String> expectedResult = new ArrayList<>() {{add("Lord Of The Ring [Tolkien]"); add("Lord Of The Ring 2 [Tolkien]");}};
        List<String> actualResult = bookReader.getListOfAllUnreadBooks();
        checkResult(expectedResult, actualResult, "Test");
    }
    public void testGetAllUnreadBooks2() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Lord Of The Ring", "Tolkien");
        Book lordOfRings2 = new Book("Lord Of The Ring 2", "Tolkien");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings);
        bookReader.addBook(lordOfRings2);
        List<String> expectedResult = new ArrayList<>();
        List<String> actualResult = bookReader.getListOfAllUnreadBooks();
        checkResult(expectedResult, actualResult, "Test");
    }
    public void testGetAllReadBooks1() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Lord Of The Ring", "Tolkien");
        Book lordOfRings2 = new Book("Lord Of The Ring 2", "Tolkien");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings);
        bookReader.addBook(lordOfRings2);
        bookReader.markAsRead(lordOfRings);
        bookReader.markAsRead(lordOfRings2);
        List<String> expectedResult = new ArrayList<>() {{add("Lord Of The Ring [Tolkien]"); add("Lord Of The Ring 2 [Tolkien]");}};
        List<String> actualResult = bookReader.getListOfAllReadBooks();
        checkResult(expectedResult, actualResult, "Test");
    }
    public void testGetAllReadBooks2() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Lord Of The Ring", "Tolkien");
        Book lordOfRings2 = new Book("Lord Of The Ring 2", "Tolkien");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings);
        bookReader.addBook(lordOfRings2);
        List<String> expectedResult = new ArrayList<>();
        List<String> actualResult = bookReader.getListOfAllReadBooks();
        checkResult(expectedResult, actualResult, "Test");
    }
    public void testMarkAsUnread1() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Lord Of The Ring", "Tolkien");
        Book lordOfRings2 = new Book("Lord Of The Ring 2", "Tolkien");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings);
        bookReader.addBook(lordOfRings2);
        bookReader.markAsUnread(lordOfRings);
        boolean actualResult = lordOfRings.isUnread();
        checkResult(actualResult);
    }
    public void testMarkAsUnread2() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Lord Of The Ring", "Tolkien");
        Book lordOfRings2 = new Book("Lord Of The Ring 2", "Tolkien");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings2);
        bookReader.markAsUnread(lordOfRings);
        boolean actualResult = lordOfRings.isUnread();
        checkResult(!actualResult);
    }
    public void testMarkAsRead1() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Lord Of The Ring", "Tolkien");
        Book lordOfRings2 = new Book("Lord Of The Ring 2", "Tolkien");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings);
        bookReader.addBook(lordOfRings2);
        bookReader.markAsRead(lordOfRings);
        boolean actualResult = lordOfRings.isRead();
        checkResult(actualResult);
    }
    public void testMarkAsRead2() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Lord Of The Ring", "Tolkien");
        Book lordOfRings2 = new Book("Lord Of The Ring 2", "Tolkien");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings2);
        bookReader.markAsRead(lordOfRings);
        boolean actualResult = lordOfRings.isRead();
        checkResult(!actualResult);
    }
    public void testFindByTitle1() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Lord Of The Ring", "Tolkien");
        Book lordOfRings2 = new Book("Lord Of The Ring 2", "Tolkien");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings);
        bookReader.addBook(lordOfRings2);
        List<Book> expectedResult = new ArrayList<>() {{add(lordOfRings2);}};
        List<Book> actualResult = bookReader.findByTitle("Lord Of The Ring 2");
        checkResult(expectedResult, actualResult);
    }
    public void testFindByTitle2() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Lord Of The Ring", "Tolkien");
        Book lordOfRings2 = new Book("Lord Of The Ring 2", "Tolkien");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings);
        bookReader.addBook(lordOfRings2);
        List<Book> expectedResult = new ArrayList<>() {{add(lordOfRings); add(lordOfRings2);}};
        List<Book> actualResult = bookReader.findByTitle("Lord");
        checkResult(expectedResult, actualResult);
    }
    public void testFindByTitle3() {
        BookReader bookReader = new BookReaderImpl();
        Book harryPotter = new Book("Harry Potter", "Rowling");
        Book lordOfRings = new Book("Lord Of The Ring", "Tolkien");
        Book lordOfRings2 = new Book("Lord Of The Ring 2", "Tolkien");
        bookReader.addBook(harryPotter);
        bookReader.addBook(lordOfRings);
        bookReader.addBook(lordOfRings2);
        List<Book> expectedResult = new ArrayList<>();
        List<Book> actualResult = bookReader.findByTitle("Of The Ring");
        checkResult(expectedResult, actualResult);
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
    private void checkResult(List<String> expectedResult, List<String> actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has failed");
        }
    }

}
