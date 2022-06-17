package student_jekaterina_soldatova.lesson_10.homework.level_2_intern;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return (this.yearOfIssueToSearch.equals(book.getYearOfIssue()));
    }

}

