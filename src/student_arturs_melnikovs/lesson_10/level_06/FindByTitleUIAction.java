package student_arturs_melnikovs.lesson_10.level_06;

import student_arturs_melnikovs.lesson_10.level_02.Book;
import student_arturs_melnikovs.lesson_10.level_02.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book's title: ");
        String title = scanner.nextLine();
        scanner.close();
        List<Book> books = bookDatabase.findByTitle(title);
        System.out.println(books);
    }
}