package student_aleksandrs_jakovenko.lesson_10.level_2_3_4;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return this.yearOfIssueToSearch.equals(book.getYearOfIssue());
    }
}
