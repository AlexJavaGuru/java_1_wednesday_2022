package student_aleksandrs_jakovenko.lesson_10.level_2_and_3;

import java.util.ArrayList;
import java.util.List;

class SearchCriteriaTest {

    public static void main(String[] args) {

        SearchCriteriaTest test = new SearchCriteriaTest();
        test.searchByAuthorTest1();
        test.searchByAuthorTest2();
        test.searchByTitleTest1();
        test.searchByTitleTest2();
        test.searchByYearTest1();
        test.searchByYearTest2();
        test.andSearchCriteriaTest1();
        test.andSearchCriteriaTest2();
        test.orSearchCriteriaTest1();
        test.orSearchCriteriaTest2();
        test.orSearchCriteriaTest3();
    }

    void searchByAuthorTest1() {
        AuthorSearchCriteria book = new AuthorSearchCriteria("Harry");
        Book book1 = new Book("Harry", "Potter");
        boolean expectedResult = true;
        boolean actualResult = book.match(book1);
        checkResult(expectedResult, actualResult, "Search buy author test1");
    }

    void searchByAuthorTest2() {
        AuthorSearchCriteria book = new AuthorSearchCriteria("Nothing");
        Book book1 = new Book("Harry", "Potter");
        boolean expectedResult = false;
        boolean actualResult = book.match(book1);
        checkResult(expectedResult, actualResult, "Search buy author test2");
    }

    void searchByTitleTest1() {
        TitleSearchCriteria book = new TitleSearchCriteria("Potter");
        Book book1 = new Book("Harry", "Potter");
        boolean expectedResult = true;
        boolean actualResult = book.match(book1);
        checkResult(expectedResult, actualResult, "Search buy title test1");
    }

    void searchByTitleTest2() {
        TitleSearchCriteria book = new TitleSearchCriteria("Nothing");
        Book book1 = new Book("Harry", "Potter");
        boolean expectedResult = false;
        boolean actualResult = book.match(book1);
        checkResult(expectedResult, actualResult, "Search buy title test2");
    }

    void searchByYearTest1() {
        YearOfIssueSearchCriteria book = new YearOfIssueSearchCriteria("2000");
        Book book1 = new Book("Harry", "Potter", "2000");
        boolean expectedResult = true;
        boolean actualResult = book.match(book1);
        checkResult(expectedResult, actualResult, "Search buy year test1");
    }

    void searchByYearTest2() {
        YearOfIssueSearchCriteria book = new YearOfIssueSearchCriteria("1950");
        Book book1 = new Book("Harry", "Potter", "2000");
        boolean expectedResult = false;
        boolean actualResult = book.match(book1);
        checkResult(expectedResult, actualResult, "Search buy year test2");
    }

    void andSearchCriteriaTest1() {
        AndSearchCriteria book = new AndSearchCriteria(new AuthorSearchCriteria("Harry"), new TitleSearchCriteria("Potter"));
        Book book1 = new Book("Harry", "Potter");
        boolean expectedResult = true;
        boolean actualResult = book.match(book1);
        checkResult(expectedResult, actualResult, "And search criteria test1");
    }

    void andSearchCriteriaTest2() {
        AndSearchCriteria book = new AndSearchCriteria(new AuthorSearchCriteria("Harry"), new TitleSearchCriteria("Potter"));
        Book book1 = new Book("Harry", "P");
        boolean expectedResult = false;
        boolean actualResult = book.match(book1);
        checkResult(expectedResult, actualResult, "And search criteria test2");
    }

    void orSearchCriteriaTest1() {
        OrSearchCriteria book = new OrSearchCriteria(new AuthorSearchCriteria("Harry"), new TitleSearchCriteria("Potter"));
        Book book1 = new Book("H", "Potter");
        boolean expectedResult = true;
        boolean actualResult = book.match(book1);
        checkResult(expectedResult, actualResult, "Or search criteria test1");
    }

    void orSearchCriteriaTest2() {
        OrSearchCriteria book = new OrSearchCriteria(new AuthorSearchCriteria("Harry"), new TitleSearchCriteria("Potter"));
        Book book1 = new Book("Harry", "P");
        boolean expectedResult = true;
        boolean actualResult = book.match(book1);
        checkResult(expectedResult, actualResult, "Or search criteria test2");
    }

    void orSearchCriteriaTest3() {
        OrSearchCriteria book = new OrSearchCriteria(new AuthorSearchCriteria("Harry"), new TitleSearchCriteria("Potter"));
        Book book1 = new Book("H", "P");
        boolean expectedResult = false;
        boolean actualResult = book.match(book1);
        checkResult(expectedResult, actualResult, "Or search criteria test3");
    }

    void checkResult(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
