package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_31;

class Book {
    private String title;
    private String author;
    private int countOfBooks;
    private String[] clientsWhoTookThisBook;
    private String[] clientsWhoReservedThisBook;

    Book(String title, String author, int countOfBooks, String[] clientsWhoTook, String[] clientsWhoReserved) {
        this.title = title;
        this.author = author;
        this.countOfBooks = countOfBooks;
        this.clientsWhoTookThisBook = clientsWhoTook;
        this.clientsWhoReservedThisBook = clientsWhoReserved;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    int getCountOfBooks() {
        return countOfBooks;
    }

    String[] getClientsWhoTookThisBook() {
        return clientsWhoTookThisBook;
    }

    String[] getClientsWhoReservedThisBook() {
        return clientsWhoReservedThisBook;
    }

    void takeBook(Client client) {
        countOfBooks--;
        clientsWhoTookThisBook = (String[])ELibraryUtil.addToArray(client.getClientName(), clientsWhoTookThisBook);
    }

    void returnBook(Client client) {
        countOfBooks++;
        clientsWhoTookThisBook = (String[])ELibraryUtil.removeFromArray(client.getClientName(), clientsWhoTookThisBook);
    }

    void reserveBook(Client client) {
        clientsWhoReservedThisBook = (String[])ELibraryUtil.addToArray(client.getClientName(), clientsWhoReservedThisBook);
    }
}
