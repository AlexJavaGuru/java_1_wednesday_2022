package student_jekaterina_soldatova.lesson_10.homework.level_1_intern;

import student_jekaterina_soldatova.lesson_10.lessoncode.User;

import java.util.Objects;

class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean contains(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.getTitle()) && Objects.equals(author, book.author);
    }
}
