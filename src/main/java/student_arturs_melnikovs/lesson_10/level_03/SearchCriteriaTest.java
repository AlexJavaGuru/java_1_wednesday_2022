package student_arturs_melnikovs.lesson_10.level_03;


import student_arturs_melnikovs.lesson_10.level_02.Book;

class SearchCriteriaTest {
    public static void main(String[] args) {
        SearchCriteriaTest tester = new SearchCriteriaTest();
        tester.testAuthorCriteria1();
        tester.testAuthorCriteria2();
        tester.testTitleCriteria1();
        tester.testTitleCriteria2();
        tester.testYearCriteria1();
        tester.testYearCriteria2();
        tester.testAndCriteria1();
        tester.testAndCriteria2();
        tester.testOrCriteria1();
        tester.testOrCriteria2();
    }

    private void testOrCriteria2() {
        SearchCriteria searchCriteria = new OrSearchCriteria(
                new AuthorSearchCriteria("1"),
                new TitleSearchCriteria("1")
        );
        Book book = new Book("2", "2");
        checkResult(!searchCriteria.test(book));
    }

    private void testOrCriteria1() {
        SearchCriteria searchCriteria = new OrSearchCriteria(
                new AuthorSearchCriteria("1"),
                new TitleSearchCriteria("1")
        );
        Book book = new Book("2", "1");
        checkResult(searchCriteria.test(book));
    }

    private void testAndCriteria2() {
        SearchCriteria searchCriteria = new AndSearchCriteria(
                new AuthorSearchCriteria("1"),
                new TitleSearchCriteria("2"));
        Book book = new Book("1", "1");
        checkResult(!searchCriteria.test(book));
    }

    private void testAndCriteria1() {
        SearchCriteria searchCriteria = new AndSearchCriteria(
                new AuthorSearchCriteria("1"),
                new TitleSearchCriteria("1"));
        Book book = new Book("1", "1");
        checkResult(searchCriteria.test(book));
    }

    private void testYearCriteria2() {
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("2000");
        Book book = new Book("1", "1", "3000");
        checkResult(!searchCriteria.test(book));
    }

    private void testYearCriteria1() {
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("2000");
        Book book = new Book("1", "1", "2000");
        checkResult(searchCriteria.test(book));
    }

    private void testTitleCriteria2() {
        SearchCriteria searchCriteria = new TitleSearchCriteria("1");
        Book book = new Book("1", "2");
        checkResult(!searchCriteria.test(book));
    }

    private void testTitleCriteria1() {
        SearchCriteria searchCriteria = new TitleSearchCriteria("1");
        Book book = new Book("1", "1");
        checkResult(searchCriteria.test(book));
    }

    private void testAuthorCriteria2() {
        SearchCriteria searchCriteria = new AuthorSearchCriteria("1");
        Book book = new Book("2", "1");
        checkResult(!searchCriteria.test(book));
    }

    private void testAuthorCriteria1() {
        SearchCriteria searchCriteria = new AuthorSearchCriteria("1");
        Book book = new Book("1", "1");
        checkResult(searchCriteria.test(book));
    }

    private void checkResult(Boolean actualResult) {
        if (actualResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test FAILED");
        }
    }
}
