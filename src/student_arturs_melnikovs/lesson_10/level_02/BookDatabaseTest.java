package student_arturs_melnikovs.lesson_10.level_02;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseTest {
    public static void main(String[] args) {
        BookDatabaseTest tester = new BookDatabaseTest();
        tester.testDeleteBook1();
        tester.testDeleteBook2();
        tester.testDeleteBook3();
        tester.testDeleteBook4();
        tester.testFindById1();
        tester.testFindById2();
        tester.testFindByAuthor1();
        tester.testFindByAuthor2();
        tester.testFindByTitle1();
        tester.testFindByTitle2();
        tester.testCountAllBooks1();
        tester.testCountAllBooks2();
        tester.testCountAllBooks3();
        tester.testDeleteByAuthor1();
        tester.testDeleteByTitle1();
    }

    private void testDeleteByTitle1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("1", "2");
        Book book3 = new Book("3", "3");
        Book book4 = new Book("2", "1");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        List<Book> expected = new ArrayList<>();
        expected.add(book2);
        expected.add(book3);
        bookDatabase.deleteByTitle("1");
        checkResult(expected.equals(bookDatabase.getMyBooks()));
    }

    private void testDeleteByAuthor1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("1", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expected = new ArrayList<>();
        expected.add(book3);
        bookDatabase.deleteByAuthor("1");
        checkResult(expected.equals(bookDatabase.getMyBooks()));
    }

    private void testCountAllBooks3() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.delete(book1);
        checkResult(bookDatabase.countAllBooks() == 2);
    }

    private void testCountAllBooks2() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        checkResult(bookDatabase.countAllBooks() == 0);
    }

    private void testCountAllBooks1() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        checkResult(bookDatabase.countAllBooks() == 3);
    }

    private void testFindByTitle2() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        checkResult(expectedResult.equals(bookDatabase.findByTitle("4")));
    }

    private void testFindByTitle1() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "1");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        checkResult(expectedResult.equals(bookDatabase.findByTitle("1")));
    }

    private void testFindByAuthor2() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        List<Book> expectedResult = new ArrayList<>();
        checkResult(expectedResult.equals(bookDatabase.findByAuthor("4")));
    }

    private void testFindByAuthor1() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("1", "2");
        Book book3 = new Book("2", "3");
        Book book4 = new Book("1", "4");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(book1);
        expectedResult.add(book2);
        expectedResult.add(book4);
        checkResult(expectedResult.equals(bookDatabase.findByAuthor("1")));
    }

    private void testFindById2() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Optional<Object> expectedResult = Optional.empty();
        Optional<Book> actualResult = bookDatabase.findById(4L);
        checkResult(expectedResult.equals(actualResult));
    }

    private void testFindById1() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Optional<Book> expectedResult = Optional.of(book1);
        Optional<Book> actualResult = bookDatabase.findById(1L);
        checkResult(expectedResult.equals(actualResult));
    }

    private void testDeleteBook1() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        checkResult(bookDatabase.delete(1L));
    }
    private void testDeleteBook2() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        checkResult(!bookDatabase.delete(4L));
    }
    private void testDeleteBook3() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        checkResult(bookDatabase.delete(book1));
    }
    private void testDeleteBook4() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        checkResult(!bookDatabase.delete(book3));
    }

    private void checkResult(Boolean actualResult) {
        if (actualResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}