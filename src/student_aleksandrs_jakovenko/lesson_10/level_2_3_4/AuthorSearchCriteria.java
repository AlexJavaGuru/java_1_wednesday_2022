package student_aleksandrs_jakovenko.lesson_10.level_2_3_4;

class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }


    public boolean match(Book book) {
        return this.authorToSearch.equals(book.getAuthor());
    }
}
