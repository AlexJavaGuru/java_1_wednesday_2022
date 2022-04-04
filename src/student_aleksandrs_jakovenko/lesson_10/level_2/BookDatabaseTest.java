package student_aleksandrs_jakovenko.lesson_10.level_2;

class BookDatabaseTest {

    public static void main(String[] args) {

        BookDatabaseTest test = new BookDatabaseTest();
        test.saveTest();
        test.deleteByIdTest1();
        test.deleteByIdTest2();
        test.deleteBookTest1();
        test.deleteBookTest2();
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
}
