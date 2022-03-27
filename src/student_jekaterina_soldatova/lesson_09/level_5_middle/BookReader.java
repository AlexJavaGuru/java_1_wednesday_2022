package student_jekaterina_soldatova.lesson_09.level_5_middle;

interface BookReader {

    void addNewBook(Book book);

    void removeBook(Book book);

    String[] returnCurrentBooks();

    String[] returnReadBooks();

    String[] returnNotReadBooks();


    Book[] findByAuthor(String author);

    Book[] findByTitle(String title);


    boolean isBookToRemoveInLibrary(Book book);

    boolean isNewBookUnique(Book book);

    boolean isBookInfoNotEmpty(Book book);

    boolean changeBookStatusToRead(Book book);

    boolean changeBookStatusToNotRead(Book book);

}
