package student_arturs_melnikovs.lesson_09.level_05;

import java.util.Objects;

class Book {

    private String title;
    private String author;
    private boolean isRead;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void markAsRead() {
        isRead = true;
    }
    public void markAsUnread() {
        isRead = false;
    }

    public boolean isRead() {
        return isRead;
    }
}
