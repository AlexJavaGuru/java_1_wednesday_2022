package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.UI;

import student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.Book;
import student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.BookDatabase;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the book`s author");
        String authorName = scanner.nextLine();
        System.out.println("Please enter the book`s title");
        String bookTitle = scanner.nextLine();
        System.out.println("Please enter the book`s year of production");
        String bookYearOfProduction = scanner.nextLine();
        scanner.close();

        Book newBook = new Book(authorName, bookTitle, bookYearOfProduction);
        bookDatabase.save(newBook);
    }
}
