package student_andrejs_saldavs.lesson_08.level_7;

class Book {

    private String bookTitle;
    private int releaseYear;
    private String bookAuthor;
    private boolean isReserved;
    private boolean isTaken;
    private int dateOfReturn;
    private Owner ownerName;

    public Book(String bookTitle, int releaseYear, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.releaseYear = releaseYear;
        this.bookAuthor = bookAuthor;
    }
}
