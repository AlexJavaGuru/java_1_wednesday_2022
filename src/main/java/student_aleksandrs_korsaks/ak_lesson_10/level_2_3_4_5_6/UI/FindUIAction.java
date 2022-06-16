package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.UI;

import student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.BookDatabase;
import student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.BookDatabaseImpl;
import student_arturs_melnikovs.lesson_10.level_03.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindUIAction implements UIAction {

    private BookDatabase bookDatabase;
    private Map<Integer, SearchCriteria> menuNumberToActionMap;

    public FindUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
        menuNumberToActionMap = new HashMap<>();
        menuNumberToActionMap.put(1, new AuthorSearchCriteria());
        menuNumberToActionMap.put(2, new TitleSearchCriteria());
        menuNumberToActionMap.put(3, new YearOfIssueSearchCriteria());
        menuNumberToActionMap.put(4, new AndSearchCriteria());
        menuNumberToActionMap.put(5, new OrSearchCriteria());
    }

    public void execute() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Menu
                    1) Author search criteria;
                    2) Title search criteria;
                    3) Year of issue search criteria;
                    4) And search criteria;
                    5) Or search criteria;
                    
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
        SearchCriteria searchCriteria = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (searchCriteria != null) {
            searchCriteria.match();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }
    }