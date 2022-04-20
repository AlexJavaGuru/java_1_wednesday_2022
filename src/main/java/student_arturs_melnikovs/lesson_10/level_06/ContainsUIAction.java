package student_arturs_melnikovs.lesson_10.level_06;

import student_arturs_melnikovs.lesson_10.level_02.Book;
import student_arturs_melnikovs.lesson_10.level_02.BookDatabase;

import java.util.Scanner;

public class ContainsUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public ContainsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book's author: ");
        String author = scanner.nextLine();
        System.out.println("Book's title: ");
        String title = scanner.nextLine();
        scanner.close();
        Book bookToCheck = new Book(author, title);
        if (bookDatabase.contains(bookToCheck)) {
            System.out.println("Library has this book");
        } else {
            System.out.println("No book found");
        }
    }
}
