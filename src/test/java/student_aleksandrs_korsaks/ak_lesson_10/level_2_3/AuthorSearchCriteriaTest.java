package student_aleksandrs_korsaks.ak_lesson_10.level_2_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorSearchCriteriaTest {

    AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A1");

    @Test
    void matchPositive() {
        Book bookOne = new Book("A1", "B1");
        assertTrue(authorSearchCriteria.match(bookOne));
    }

    @Test
    void matchNegative() {
        Book bookTwo = new Book("A2", "B2");
        assertFalse(authorSearchCriteria.match(bookTwo));
    }
}