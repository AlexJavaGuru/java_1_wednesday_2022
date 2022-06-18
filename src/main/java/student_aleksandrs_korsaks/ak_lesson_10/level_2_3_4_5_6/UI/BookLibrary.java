package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.UI;

import student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.BookDatabase;
import student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.BookDatabaseImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap<>();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new FindUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new FindUniqueAuthorsUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new FindUniqueTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new FindUniqueBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new DeleteByBookUIAction(bookDatabase));
        menuNumberToActionMap.put(13, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(14, new ContainsUIAction(bookDatabase));
        menuNumberToActionMap.put(15, new GetAuthorToBooksMapUIAction(bookDatabase));
        menuNumberToActionMap.put(16, new GetEachAuthorBookCountUIAction(bookDatabase));

    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Menu
                    1) Save book;                 9) Delete book by ID;
                    2) Find book by ID;           10) Delete book by Author;
                    3) Find all author`s books;   11) Delete book by title;
                    4) Find books by title;       12) Delete book;
                    5) Find books by criteria;    13) Count all books;
                    6) Find unique authors;       14) Check for book containment ;
                    7) Find unique titles;        15) Show all books for each author ;
                    8) Find unique books;         16) Count all unique books for each author ;
                                        
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