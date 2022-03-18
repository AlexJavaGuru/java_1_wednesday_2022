package student_arturs_melnikovs.lesson_09.level_05;

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
}
