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
        bookReaderTest.getBookListInStringTest();
        bookReaderTest.getAllBooksOfAuthorPositiveTest();
        bookReaderTest.getAllBooksOfAuthorNegativeTest();
        bookReaderTest.getAllBooksOfTitlePositiveTest();
        bookReaderTest.getAllBooksOfTitleNegativeTest();
        bookReaderTest.checkBookAsReadenPositiveTest();
        bookReaderTest.checkBookAsReadenNegativeTest();
        bookReaderTest.uncheckBookAsReadenPositiveTest();
        bookReaderTest.uncheckBookAsReadenNegativeTest();

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

    public void getBookListInStringTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book bookOne = new Book("John", "Potter");
        Book bookTwo = new Book("John2", "Potter2");
        bookReader.addBook(bookOne);
        bookReader.addBook(bookTwo);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add(String.valueOf(bookOne));
        expectedResult.add(String.valueOf(bookTwo));
        List<String> realResult = bookReader.getBookListInString();
        checkTestResult("getBookListInStringTest", realResult.equals(expectedResult));
    }

    public void getAllBooksOfAuthorPositiveTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book bookOne = new Book("John", "Potter");
        Book bookTwo = new Book("Alfred", "Potter2");
        Book bookThree = new Book("John", "Potter2");
        bookReader.addBook(bookOne);
        bookReader.addBook(bookTwo);
        bookReader.addBook(bookThree);
        List<Book> realResult = bookReader.getAllBooksOfAuthor("Jo");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(bookOne);
        expectedResult.add(bookThree);
        checkTestResult("getAllBooksOfAuthorPositiveTest", expectedResult.equals(realResult));
    }

    public void getAllBooksOfAuthorNegativeTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book bookOne = new Book("John", "Potter");
        Book bookTwo = new Book("John2", "Potter2");
        Book bookThree = new Book("John", "Potter2");
        bookReader.addBook(bookOne);
        bookReader.addBook(bookTwo);
        bookReader.addBook(bookThree);
        List<Book> realResult = bookReader.getAllBooksOfAuthor("John3");
        checkTestResult("getAllBooksOfAuthorNegativeTest", realResult.isEmpty());
    }

    public void getAllBooksOfTitlePositiveTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book bookOne = new Book("John", "Cinderella");
        Book bookTwo = new Book("Alfred", "Potter2");
        Book bookThree = new Book("John", "Potter2");
        bookReader.addBook(bookOne);
        bookReader.addBook(bookTwo);
        bookReader.addBook(bookThree);
        List<Book> realResult = bookReader.getAllBooksOfTitle("Pot");
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(bookTwo);
        expectedResult.add(bookThree);
        checkTestResult("getAllBooksOfTitlePositiveTest", expectedResult.equals(realResult));
    }

    public void getAllBooksOfTitleNegativeTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book bookOne = new Book("John", "Potter");
        Book bookTwo = new Book("John2", "Potter2");
        Book bookThree = new Book("John", "Potter2");
        bookReader.addBook(bookOne);
        bookReader.addBook(bookTwo);
        bookReader.addBook(bookThree);
        List<Book> realResult = bookReader.getAllBooksOfTitle("ott");
        checkTestResult("getAllBooksOfTitleNegativeTest", realResult.isEmpty());
    }

    public void checkBookAsReadenPositiveTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book bookOne = new Book("John", "Potter");
        Book bookTwo = new Book("John2", "Potter2");
        bookReader.addBook(bookOne);
        bookReader.addBook(bookTwo);
        boolean realResultBeforeCheck = bookTwo.isReaden();
        boolean realResult = bookReader.checkBookAsReaden("Potter2");
        boolean realResultAfterCheck = bookTwo.isReaden();
        checkTestResult("checkBookAsReadenPositiveTest", (realResult) && !(realResultBeforeCheck) && (realResultAfterCheck));

    }

    public void checkBookAsReadenNegativeTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book bookOne = new Book("John", "Potter");
        Book bookTwo = new Book("John2", "Potter2");
        bookReader.addBook(bookOne);
        bookReader.addBook(bookTwo);
        boolean realResultBeforeCheck = bookTwo.isReaden();
        boolean realResult = bookReader.checkBookAsReaden("Potter3");
        boolean realResultAfterCheck = bookTwo.isReaden();
        checkTestResult("checkBookAsReadenNegativeTest", !(realResult && realResultBeforeCheck && realResultAfterCheck));

    }

    public void uncheckBookAsReadenPositiveTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book bookOne = new Book("John", "Potter");
        Book bookTwo = new Book("John2", "Potter2");
        bookReader.addBook(bookOne);
        bookReader.addBook(bookTwo);
        bookReader.checkBookAsReaden("Potter2");
        boolean realResultBeforeUncheck = bookTwo.isReaden();
        boolean realResult = bookReader.uncheckBookAsReaden("Potter2");
        boolean realResultAfterUncheck = bookTwo.isReaden();
        checkTestResult("uncheckBookAsReadenPositiveTest", (realResult) && (realResultBeforeUncheck) && !(realResultAfterUncheck));

    }

    public void uncheckBookAsReadenNegativeTest() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book bookOne = new Book("John", "Potter");
        bookReader.addBook(bookOne);
        bookReader.checkBookAsReaden("Potter");
        boolean realResultBeforeUncheck = bookOne.isReaden();
        boolean realResult = bookReader.uncheckBookAsReaden("Potter3");
        boolean realResultAfterUncheck = bookOne.isReaden();
        checkTestResult("uncheckBookAsReadenNegativeTest", !(realResult) && (realResultBeforeUncheck) && (realResultAfterUncheck));

    }

    public void checkTestResult(String testName, boolean condition) {
        if (condition) {
            System.out.println("'" + testName + "'" + " test is OK");
        } else {
            System.out.println("'" + testName + "'" + " test is FAIL");
        }
    }
}
