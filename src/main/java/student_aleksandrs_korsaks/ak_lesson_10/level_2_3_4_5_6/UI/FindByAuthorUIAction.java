package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.UI;

import student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.Book;
import student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.BookDatabase;

import java.util.List;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the book`s author");
        String bookAuthor = scanner.nextLine();
        scanner.close();

        List<Book> authorBooks = bookDatabase.findByAuthor(bookAuthor);

        System.out.println(authorBooks);
    }
}