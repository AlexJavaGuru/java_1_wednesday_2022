package student_jekaterina_soldatova.lesson_10.homework.level_2_intern;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return (this.titleToSearch.equals(book.getTitle()));
    }

}

