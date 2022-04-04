package student_jekaterina_soldatova.lesson_10.homework.level_2_intern;

import java.util.List;

public class SearchCriteriaDemo {
    BookDatabaseImpl database;

    SearchCriteriaDemo() {
        this.database = addBooks();
    }

    public static void main(String[] args) {

        SearchCriteriaDemo search = new SearchCriteriaDemo();
        search.findByAuthorAndTitle();
        search.findByAuthorAndYear();
        search.findByAuthorOrYearOrTitle();

    }

    static BookDatabaseImpl addBooks() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("Kuper", "Zveroboi");
        book1.setYearOfIssue("1890");

        Book book2 = new Book("Kuper", "Something");
        book2.setYearOfIssue("1890");

        Book book3 = new Book("Someone", "Zveroboi");
        book3.setYearOfIssue("1895");

        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        //printList(bookDatabase.getBookList());
        return bookDatabase;
    }

    void findByAuthorAndTitle() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        List<Book> foundBooks = database.find(searchCriteria);

        System.out.println("found by author and title:");
        printList(foundBooks);
    }

    void findByAuthorAndYear() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, yearSearchCriteria);
        List<Book> foundBooks = database.find(searchCriteria);

        System.out.println("found by author and year:");
        printList(foundBooks);
    }

    void findByAuthorOrYearOrTitle() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");

        SearchCriteria authorOrTitle = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteria = new OrSearchCriteria(authorOrTitle, yearSearchCriteria);
        List<Book> foundBooks = database.find(searchCriteria);

        System.out.println("found by author or title or year:");
        printList(foundBooks);
    }


    static void printList(List<Book> foundBooks) {
        for (Book book: foundBooks) {
            System.out.println(book.getAuthor() + ": " + book.getTitle() + ", " + book.getYearOfIssue());
        }
        System.out.println();
    }
}
