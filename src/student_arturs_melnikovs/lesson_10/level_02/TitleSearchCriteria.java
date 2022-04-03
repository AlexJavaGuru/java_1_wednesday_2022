package student_arturs_melnikovs.lesson_10.level_02;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }
    @Override
    public boolean match(Book book) {
        return book.getTitle().equals(titleToSearch);
    }
}
