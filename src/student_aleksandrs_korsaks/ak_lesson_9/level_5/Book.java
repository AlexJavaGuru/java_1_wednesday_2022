package student_aleksandrs_korsaks.ak_lesson_9.level_5;

import java.util.Objects;

class Book {

    private String bookAuthor;
    private String bookTitle;

    public Book(String bookAuthor, String bookTitle) {
        this.bookAuthor = bookAuthor;
        this.bookTitle = bookTitle;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getBookAuthor().equals(book.getBookAuthor()) && getBookTitle().equals(book.getBookTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookAuthor(), getBookTitle());
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookAuthor='" + bookAuthor + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                '}';
    }
}
