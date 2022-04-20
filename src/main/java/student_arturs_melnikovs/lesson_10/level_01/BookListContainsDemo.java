package student_arturs_melnikovs.lesson_10.level_01;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {

    public static void main(String[] args) {
        List<Book> books = new ArrayList();
        Book book1 = new Book("Tolkien", "LOTR");
        Book book2 = new Book("Rowling", "HP");
        books.add(book1);
        books.add(book2);
        System.out.println(books.contains(book1));
    }
}
