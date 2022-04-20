package student_arturs_melnikovs.lesson_10.level_06;

import student_arturs_melnikovs.lesson_10.level_02.BookDatabase;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book's id: ");
        Long id = scanner.nextLong();
        if(bookDatabase.delete(id)) {
            System.out.println("Book deleted");
        } else {
            System.out.println("Book not found");
        }

    }
}
