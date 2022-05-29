package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindTest {

    BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
    List<Book> testCollectionToCompareResult = new ArrayList<>();

    @BeforeEach
    void setUp() {
        Book bookOne = new Book("A1", "B1", "1990");
        bookDatabase.save(bookOne); // bookOne ID are set to 1L and added to collection
        testCollectionToCompareResult.add(bookOne);

        Book bookTwo = new Book("A1", "B1", "1990");
        bookDatabase.save(bookTwo);// bookTwo ID are set to 2L and added to collection
        testCollectionToCompareResult.add(bookTwo);

//  bookOne is equal bookTwo, despite bookID`s are different
//  because bookId not included in equal() and hash() and all rest fields are same

        Book bookThree = new Book("A2", "B2", "1990");
        bookDatabase.save(bookThree);// bookThree ID are set to 3L and added to collection
        testCollectionToCompareResult.add(bookThree);

        Book bookFour = new Book("A2", "B1", "1991");
        bookDatabase.save(bookFour);// bookThree ID are set to 4L and added to collection
        testCollectionToCompareResult.add(bookFour);

    }

    @Test
    void findPositiveAuthorSearchCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A1");
        testCollectionToCompareResult.remove(3);
        testCollectionToCompareResult.remove(2);
        assertEquals(testCollectionToCompareResult, bookDatabase.find(authorSearchCriteria));
    }

    @Test
    void findNegativeAuthorSearchCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A3");
        assertEquals(Collections.emptyList(), bookDatabase.find(authorSearchCriteria));
    }

    @Test
    void findPositiveTitleSearchCriteria() {
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("B1");
        testCollectionToCompareResult.remove(2);
        assertEquals(testCollectionToCompareResult, bookDatabase.find(titleSearchCriteria));
    }

    @Test
    void findNegativeTitleSearchCriteria() {
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("B3");
        assertEquals(Collections.emptyList(), bookDatabase.find(titleSearchCriteria));
    }

    @Test
    void findPositiveYearOfIssueSearchCriteria() {
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1990");
        testCollectionToCompareResult.remove(3);
        assertEquals(testCollectionToCompareResult, bookDatabase.find(yearOfIssueSearchCriteria));
    }

    @Test
    void findNegativeYearOfIssueSearchCriteria() {
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1992");
        assertEquals(Collections.emptyList(), bookDatabase.find(yearOfIssueSearchCriteria));
    }

    @Test
    void findPositiveAndSearchCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A2");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("B1");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        testCollectionToCompareResult.remove(2);
        testCollectionToCompareResult.remove(1);
        testCollectionToCompareResult.remove(0);
        assertEquals(testCollectionToCompareResult, bookDatabase.find(andSearchCriteria));
    }

    @Test
    void findNegativeAndSearchCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A1");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("B2");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        assertEquals(Collections.emptyList(), bookDatabase.find(andSearchCriteria));
    }

    @Test
    void findPositiveOrSearchCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A1");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("B1");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        testCollectionToCompareResult.remove(2);
        assertEquals(testCollectionToCompareResult, bookDatabase.find(orSearchCriteria));
    }

    @Test
    void findNegativeOrSearchCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A3");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("B3");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        assertEquals(Collections.emptyList(), bookDatabase.find(orSearchCriteria));
    }

    @Test
    void findPositiveComplicateSearchCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A1");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("B1");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1991");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria orSearchCriteria = new OrSearchCriteria(andSearchCriteria, yearOfIssueSearchCriteria);
        testCollectionToCompareResult.remove(2);
        assertEquals(testCollectionToCompareResult, bookDatabase.find(orSearchCriteria));
    }

    @Test
    void findNegativeComplicateSearchCriteria() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A1");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("B2");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1992");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria orSearchCriteria = new OrSearchCriteria(andSearchCriteria, yearOfIssueSearchCriteria);
        assertEquals(Collections.emptyList(), bookDatabase.find(orSearchCriteria));
    }
}