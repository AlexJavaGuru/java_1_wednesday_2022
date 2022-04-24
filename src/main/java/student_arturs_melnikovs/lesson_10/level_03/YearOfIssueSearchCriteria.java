package student_arturs_melnikovs.lesson_10.level_03;

import student_arturs_melnikovs.lesson_10.level_02.Book;


public class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return book.getYearOfIssue().equals(yearOfIssueToSearch);
    }

}
