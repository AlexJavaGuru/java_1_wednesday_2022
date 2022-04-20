package student_arturs_melnikovs.lesson_10.level_06;

import student_arturs_melnikovs.lesson_10.level_02.Book;
import student_arturs_melnikovs.lesson_10.level_02.BookDatabase;
import student_arturs_melnikovs.lesson_10.level_06.UIAction;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book title: ");
        String title = scanner.nextLine();
        System.out.println("Book author: ");
        String author = scanner.nextLine();
        System.out.println("Year of issue: ");
        String year = scanner.nextLine();
        Book book = new Book(title, author, year);
        bookDatabase.save(book);
    }

}
