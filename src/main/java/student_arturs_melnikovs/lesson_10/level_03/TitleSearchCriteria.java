package student_arturs_melnikovs.lesson_10.level_03;

import student_arturs_melnikovs.lesson_10.level_02.Book;


public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }
    @Override
    public boolean test(Book book) {
        return book.getTitle().equals(titleToSearch);
    }
}
