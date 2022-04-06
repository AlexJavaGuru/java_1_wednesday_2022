package student_aleksandrs_korsaks.ak_lesson_8.level_7.Task_31;

import java.util.Objects;

class Book {
    private long bookId;
    String bookAuthor;
    String bookTitle;
    private boolean bookIsTaken;
    private boolean bookIsReserved;

    public Book(String bookAuthor, String bookTitle, boolean bookIsTaken, boolean bookIsReserved) {
        this.bookAuthor = bookAuthor;
        this.bookTitle = bookTitle;
        this.bookIsTaken = bookIsTaken;
        this.bookIsReserved = bookIsReserved;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public boolean isBookIsTaken() {
        return bookIsTaken;
    }

    public void setBookIsTaken(boolean bookIsTaken) {
        this.bookIsTaken = bookIsTaken;
    }

    public boolean isBookIsReserved() {
        return bookIsReserved;
    }

    public void setBookIsReserved(boolean bookIsReserved) {
        this.bookIsReserved = bookIsReserved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getBookId() == book.getBookId() && isBookIsTaken() == book.isBookIsTaken() && isBookIsReserved() == book.isBookIsReserved() && getBookAuthor().equals(book.getBookAuthor()) && getBookTitle().equals(book.getBookTitle());
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookIsTaken=" + bookIsTaken +
                ", bookIsReserved=" + bookIsReserved +
                '}';
    }
}
