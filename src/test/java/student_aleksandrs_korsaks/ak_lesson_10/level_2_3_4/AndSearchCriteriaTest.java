package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AndSearchCriteriaTest {

    AndSearchCriteria andSearchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("A1"),
            new YearOfIssueSearchCriteria("1990"));

    @Test
    void matchPositive() {
        Book bookOne = new Book("A1", "B1", "1990");
        assertTrue(andSearchCriteria.match(bookOne));
    }

    @Test
    void matchNegative() {
        Book bookTwo = new Book("A1", "B1", "1991");
        assertFalse(andSearchCriteria.match(bookTwo));
    }
}