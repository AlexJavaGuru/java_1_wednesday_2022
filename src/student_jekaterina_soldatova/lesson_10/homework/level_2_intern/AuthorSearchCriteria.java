package student_jekaterina_soldatova.lesson_10.homework.level_2_intern;

class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        return (this.authorToSearch.equals(book.getAuthor()));
    }

}

