package student_jekaterina_soldatova.lesson_09.level_5_middle;

interface BookReader {

    void addNewBook(Book book);

    void removeBook(Book book);

    String[] printCurrentBooks();

    boolean isBookToRemoveInLibrary(Book book);

    boolean isNewBookUnique(Book book);

    boolean isBookInfoNotEmpty(Book book);
}
