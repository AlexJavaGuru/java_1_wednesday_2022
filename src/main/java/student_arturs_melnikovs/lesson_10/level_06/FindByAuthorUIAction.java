package student_arturs_melnikovs.lesson_10.level_06;

import student_arturs_melnikovs.lesson_10.level_02.Book;
import student_arturs_melnikovs.lesson_10.level_02.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Author's name: ");
        String authorName = scanner.nextLine();
        List<Book> books = bookDatabase.findByAuthor(authorName);
        System.out.println(books);
    }
}
