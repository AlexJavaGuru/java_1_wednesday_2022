package student_aleksandrs_jakovenko.lesson_9.level_5;

class BookReaderTest {

    public static void main(String[] args) {

        BookReaderTest test = new BookReaderTest();
        test.addBookTest1();
        test.addBookTest2();
    }

    public void addBookTest1() {
        BookReaderImpl book = new BookReaderImpl();
        boolean actualResult = book.addBook("Harry", "Potter");
        boolean expectedResult = true;
        checkResult(actualResult, expectedResult, "Add book test");
    }

    public void addBookTest2() {
        BookReaderImpl book = new BookReaderImpl();

        book.addBook("Harry2", "Potter2");
        book.addBook("Harry11", "Potter11");
        boolean actualResult = book.addBook("Harry", "Potter");
        boolean expectedResult = false;
        checkResult(actualResult, expectedResult, "Add book test");
    }

    public void checkResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
