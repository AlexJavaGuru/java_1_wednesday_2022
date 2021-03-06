package student_aleksandrs_jakovenko.lesson_10.level_2_3_4;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return this.titleToSearch.equals(book.getTitle());
    }

}