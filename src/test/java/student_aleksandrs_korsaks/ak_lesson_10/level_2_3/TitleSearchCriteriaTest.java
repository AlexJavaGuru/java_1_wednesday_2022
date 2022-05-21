package student_aleksandrs_korsaks.ak_lesson_10.level_2_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TitleSearchCriteriaTest {

    TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("B1");

    @Test
    void matchPositive() {
        Book bookOne = new Book("A1", "B1","1990");
        assertTrue(titleSearchCriteria.match(bookOne));
    }

    @Test
    void matchNegative() {
        Book bookTwo = new Book("A2", "B2","1990");
        assertFalse(titleSearchCriteria.match(bookTwo));
    }
}