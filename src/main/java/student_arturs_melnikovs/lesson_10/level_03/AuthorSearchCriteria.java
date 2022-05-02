package student_arturs_melnikovs.lesson_10.level_03;

import student_arturs_melnikovs.lesson_10.level_02.Book;


public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean test(Book book) {
        return book.getAuthor().equals(authorToSearch);
    }
}
