package student_arturs_melnikovs.lesson_10.level_02;


class BookDatabaseTest {
    public static void main(String[] args) {
        BookDatabaseTest tester = new BookDatabaseTest();
        tester.testDeleteBook1();
        tester.testDeleteBook2();
    }

    void testDeleteBook1() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        checkResult(bookDatabase.delete(1L));
    }
    void testDeleteBook2() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("1", "1");
        Book book2 = new Book("2", "2");
        Book book3 = new Book("3", "3");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        checkResult(!bookDatabase.delete(4L));
    }

    void checkResult(Boolean actualResult) {
        if (actualResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}