package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_31;

class Client {
    private String name;
    private String[] booksTakenByThisClient;
    private String[] booksReservedByThisClient;

    Client(String name, String[] booksTaken, String[] booksReserved) {
        this.name = name;
        this.booksTakenByThisClient = booksTaken;
        this.booksReservedByThisClient = booksReserved;
    }

    String getClientName() {
        return name;
    }

    String[] getBooksTakenByThisClient() {
        return booksTakenByThisClient;
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
