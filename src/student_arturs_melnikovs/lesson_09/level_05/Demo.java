package student_arturs_melnikovs.lesson_09.level_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class Demo{



    public static void main(String[] args) {
        BookReader bookReader = new BookReaderImpl();
        Book hp = new Book("Harry Potter", "Rowling");
        Book lotr = new Book("Lord Of The Rings", "Tolkien");
        Book lotr2 = new Book("lotr2", "Tolkien");
        bookReader.addBook(hp);
        bookReader.addBook(lotr);
        System.out.println(Arrays.toString(bookReader.getListOfAllBooks()));
        System.out.println(bookReader.findByAuthor("Tolkien").toString());
        bookReader.addBook(lotr2);
        bookReader.findByAuthor("Tolkien");
    }

}
