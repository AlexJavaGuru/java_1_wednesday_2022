package student_arturs_melnikovs.lesson_10.level_06;

import student_arturs_melnikovs.lesson_10.level_02.BookDatabase;

import java.util.Scanner;

public class DeleteByAuthorUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Author to delete: ");
        String author = sc.nextLine();
        sc.close();
        bookDatabase.deleteByAuthor(author);
    }
}
