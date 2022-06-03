package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearOfIssueSearchCriteriaTest {

    YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1990");

    @Test
    void matchPositive() {
        Book bookOne = new Book("A1","B1","1990");
        assertTrue(yearOfIssueSearchCriteria.match(bookOne));
    }

    @Test
    void matchNegative() {
        Book bookOne = new Book("A2","B2","1991");
        assertFalse(yearOfIssueSearchCriteria.match(bookOne));
    }
}