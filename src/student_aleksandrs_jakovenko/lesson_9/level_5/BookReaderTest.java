package student_aleksandrs_jakovenko.lesson_9.level_5;

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
    }

    public void addBookTest1() {
        BookReader book = new BookReaderImpl();
        boolean actualResult = book.addBook("Harry", "Potter");
        boolean expectedResult = true;
        checkResult(actualResult, expectedResult, "Add book test1");
    }

    public void addBookTest2() {
        BookReader book = new BookReaderImpl();
        book.addBook("Harry1", "Potter1");
        boolean actualResult = book.addBook("Harry", "Potter");
        boolean expectedResult = true;
        checkResult(actualResult, expectedResult, "Add book test2");
    }

    public void addBookTest3() {
        BookReader book = new BookReaderImpl();
        book.addBook("Harry", "Potter");
        boolean actualResult = book.addBook("Harry", "Potter");
        boolean expectedResult = false;
        checkResult(actualResult, expectedResult, "Add book test3");
    }

    public void addBookTest4() {
        BookReader book = new BookReaderImpl();
        boolean actualResult = book.addBook("Harry", "");
        boolean expectedResult = false;
        checkResult(actualResult, expectedResult, "Add book test4");
    }

    public void deleteBookTest1() {
        BookReader book = new BookReaderImpl();
        book.addBook("Harry", "Potter");
        boolean actualResult = book.deleteBook("Harry", "Potter");
        boolean expectedResult = true;
        checkResult(actualResult, expectedResult, "Delete book test1");
    }

    public void deleteBookTest2() {
        BookReader book = new BookReaderImpl();
        book.addBook("Harry1", "Potter1");
        boolean actualResult = book.deleteBook("Harry", "Potter");
        boolean expectedResult = false;
        checkResult(actualResult, expectedResult, "Delete book test2");
    }

    public void printBookTest() {
        BookReader book = new BookReaderImpl();
        book.addBook("Harry", "Potter");
        book.printBooks();
    }

    public void checkResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
