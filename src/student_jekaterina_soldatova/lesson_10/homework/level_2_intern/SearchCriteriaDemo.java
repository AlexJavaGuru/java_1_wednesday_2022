package student_jekaterina_soldatova.lesson_10.homework.level_2_intern;

public class SearchCriteriaDemo {
    public static void main(String[] args) {

        addBooks();
        findByAuthorAndTitle();

    }

    static void addBooks() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("Kuper", "Zveroboi");
        book1.setYearOfIssue("1890");

        Book book2 = new Book("Kuper", "Something");
        book2.setYearOfIssue("1890");

        Book book3 = new Book("Not Kuper", "Zveroboi");
        book2.setYearOfIssue("1895");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

       // return bookDatabase;
    }

    static void findByAuthorAndTitle() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println(searchCriteria.match(new Book("Kuper", "Zveroboi")));
    }
}
