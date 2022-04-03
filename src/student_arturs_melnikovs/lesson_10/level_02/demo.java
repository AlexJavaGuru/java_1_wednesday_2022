package student_arturs_melnikovs.lesson_10.level_02;

import student_arturs_melnikovs.lesson_10.level_06.FindByIdUIAction;
import student_arturs_melnikovs.lesson_10.level_06.UIAction;

public class demo {
    public static void main(String[] args) {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book tolstoj1 = new Book("Tolstoj", "tolstoj1");
        Book tolstoj2 = new Book("Tolstoj", "tolstoj2");
        Book tolstoj3 = new Book("Tolstoj", "tolstoj3");
        Book pushkin1 = new Book("Pushkin", "pushkin1");
        Book pushkin2 = new Book("Pushkin", "pushkin2");
        Book pushkin3 = new Book("Pushkin", "pushkin3");
        Book tolkien1 = new Book("Tolkien", "tolikien1");
        Book tolkien2 = new Book("Tolkien", "tolikien2");
        Book tolkien3 = new Book("Tolkien", "tolikien3");
        bookDatabase.save(tolstoj1);
        bookDatabase.save(tolstoj2);
        bookDatabase.save(tolstoj3);
        bookDatabase.save(pushkin1);
        bookDatabase.save(pushkin2);
        bookDatabase.save(pushkin3);
        bookDatabase.save(tolkien1);
        bookDatabase.save(tolkien2);
        bookDatabase.save(tolkien3);
        System.out.println(bookDatabase.getAuthorToBooksMap().toString());
        UIAction action = new FindByIdUIAction(bookDatabase);
        action.execute();
    }
}
