package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.UI;

import student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.BookDatabase;
import student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.BookDatabaseImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap<>();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new FindUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new DeleteByBookUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new CountAllBooksUIAction(bookDatabase));

    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Menu
                    1) Save book;
                    2) Find book by ID;
                    3) Find all author`s books;
                    4) Find books by title;
                    5) Find books by criteria;
                    6) Delete book by ID;
                    7) Delete book by Author;
                    8) Delete book by title;
                    9) Delete book;
                    10) Count all books;
                    0) Exit
                    """);

            System.out.println("Please enter menu number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }

}