package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_31;

class Client {
    private String name;
    private String eMail;
    private String[] booksTakenByThisClient;
    private String dateWhenTaken;
    private String[] booksReservedByThisClient;

    Client(String name, String eMail, String[] booksTaken, String dateWhenTaken, String[] booksReserved) {
        this.name = name;
        this.eMail = eMail;
        this.booksTakenByThisClient = booksTaken;
        this.dateWhenTaken = dateWhenTaken;
        this.booksReservedByThisClient = booksReserved;
    }

    String getClientName() {
        return name;
    }

    String[] getBooksTakenByThisClient() {
        return booksTakenByThisClient;
    }

    String getDateWhenTaken() {
        return dateWhenTaken;
    }

    String[] getBooksReservedByThisClient() {
        return booksReservedByThisClient;
    }

    void takeBook(Book book){
        booksTakenByThisClient = (String[])ELibraryUtil.addToArray(book.getTitle(), booksTakenByThisClient);
    }

    void returnBook(Book book) {
        booksTakenByThisClient = (String[])ELibraryUtil.removeFromArray(book.getTitle(), booksTakenByThisClient);
    }

    void reserveBook(Book book) {
        booksReservedByThisClient = (String[])ELibraryUtil.addToArray(book.getTitle(), booksReservedByThisClient);
    }
}
