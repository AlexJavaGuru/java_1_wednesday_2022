package student_jekaterina_soldatova.lesson_10.homework.level_1_intern;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");

        books.add(book1);
        books.add(book2);

        for (Book item: books) {
            System.out.println(item.getAuthor());
        }

        Book bookInTheList = new Book("A1", "B1");
        boolean containsBook = bookInTheList.contains(books); // должно быть true

        Book bookNotInTheList = new Book("A3", "B3");
        boolean notContainsBook = bookNotInTheList.contains(books); // должно быть false

        System.out.println(containsBook + " " + notContainsBook);
    }

}
