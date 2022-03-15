package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_31;

import java.util.Date;

class Client {
    private String name;
    private String eMail;
    private Object[][] booksTakenByThisClient; //[book][date when taken][date when to return]
    private Book[] booksReservedByThisClient;

    Client(String name, String eMail, Object[][] booksTaken, Book[] booksReserved) {
        this.name = name;
        this.eMail = eMail;
        this.booksTakenByThisClient = booksTaken;
        this.booksReservedByThisClient = booksReserved;
    }

    String getClientName() {
        return name;
    }

    Object[][] getBooksTakenByThisClient() {
        return booksTakenByThisClient;
    }

    Book[] getBooksReservedByThisClient() {
        return booksReservedByThisClient;
    }

    void takeBook(Book book, Date dateWhenTaken){
        booksTakenByThisClient = ELibraryUtil.takeBook(book, booksTakenByThisClient, dateWhenTaken);
    }

    void returnBook(Book book) {
        booksTakenByThisClient = ELibraryUtil.removeFromArray(book.getTitle(), booksTakenByThisClient);
    }

    void reserveBook(Book book) {
        booksReservedByThisClient = (Book[])ELibraryUtil.addToArray(book, booksReservedByThisClient);
    }
}
