package student_jekaterina_soldatova.lesson_10.homework.level_1_intern;

import java.util.List;

class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    boolean contains(List<Book> books) {
        for (Book item : books) {
            if (title.equals(item.getTitle()) && author.equals(item.getAuthor())) {
                return true;
            }
        }
       return false;
    }
}
