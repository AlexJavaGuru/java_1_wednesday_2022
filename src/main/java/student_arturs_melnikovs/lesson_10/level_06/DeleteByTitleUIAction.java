package student_arturs_melnikovs.lesson_10.level_06;

import student_arturs_melnikovs.lesson_10.level_02.BookDatabase;

import java.util.Scanner;

public class DeleteByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Title to delete: ");
        String title = sc.nextLine();
        sc.close();
        bookDatabase.deleteByTitle(title);
    }
}
