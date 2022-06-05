package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.UI;

import student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.Book;
import student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the book`s title");
        String bookTitle = scanner.nextLine();

        List<Book> byTitle = bookDatabase.findByTitle(bookTitle);

        System.out.println(byTitle);
    }
}
