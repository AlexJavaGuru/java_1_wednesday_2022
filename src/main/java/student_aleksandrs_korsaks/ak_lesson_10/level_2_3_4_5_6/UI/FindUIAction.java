package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.UI;

import student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5_6.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class FindUIAction implements UIAction {

    private BookDatabase bookDatabase;
    private Map<Integer, Function<String, SearchCriteria>> menuNumberToActionMap;

    public FindUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;

        menuNumberToActionMap = new HashMap<>();
        menuNumberToActionMap.put(1, AuthorSearchCriteria::new);
        menuNumberToActionMap.put(2, TitleSearchCriteria::new);
        menuNumberToActionMap.put(3, YearOfIssueSearchCriteria::new);
//        menuNumberToActionMap.put(4, new AndSearchCriteria());
//        menuNumberToActionMap.put(5, new OrSearchCriteria());
    }

    public void execute() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Menu (find by criteria)
                    --------------------------
                    1) Author search criteria;
                    2) Title search criteria;
                    3) Year of issue search criteria;
                    4) And search criteria;
                    5) Or search criteria;

                    0) Exit (Return to main menu)
                    """);

            System.out.println("Please enter menu (find by criteria) number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("You`ve been returned to main menu");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        Function<String, SearchCriteria> stringSearchCriteriaFunction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (stringSearchCriteriaFunction != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the chosen criteria");
            String userInput = scanner.nextLine();
            SearchCriteria searchCriteria = stringSearchCriteriaFunction.apply(userInput);
            System.out.println(bookDatabase.find(searchCriteria));
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }
}