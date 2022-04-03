package student_arturs_melnikovs.lesson_10.level_06;

import student_arturs_melnikovs.lesson_10.level_02.Book;
import student_arturs_melnikovs.lesson_10.level_02.BookDatabase;
import student_arturs_melnikovs.lesson_10.level_06.UIAction;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book's ID: ");
        Long booksId = scanner.nextLong();
        Optional<Book> bookOptional = bookDatabase.findById(booksId);
        // запросите id книги с консоли у пользолвателя
        // поиск книги в базе данных: Optional<Book> bookOpt = bookDatabase.findById(id);
        // вывелите на консоль результаты поиска
        System.out.println(bookOptional);
    }

}
