package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.UI;

import student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.Book;
import student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the book`s ID");
        Long bookId = scanner.nextLong();

        Optional<Book> bookOpt = bookDatabase.findById(bookId);

        if (bookOpt.isPresent()) {
            System.out.println("Result for book with ID " + bookId + " is: " + bookOpt);
        } else {
            System.out.println("there is no book with ID - " + bookId);
        }
    }
}
