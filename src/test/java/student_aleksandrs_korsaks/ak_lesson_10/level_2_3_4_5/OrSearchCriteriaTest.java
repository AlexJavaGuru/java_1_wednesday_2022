package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrSearchCriteriaTest {

    OrSearchCriteria orSearchCriteria = new OrSearchCriteria(new AuthorSearchCriteria("A1"),
            new TitleSearchCriteria("B1"));

    @Test
    void matchPositiveOne() {
        Book bookOne = new Book("A1", "B2", "1990");
        assertTrue(orSearchCriteria.match(bookOne));
    }

    @Test
    void matchPositiveTwo() {
        Book bookTwo = new Book("A1", "B1", "1990");
        assertTrue(orSearchCriteria.match(bookTwo));
    }

    @Test
    void matchNegative() {
        Book bookThree = new Book("A2", "B2", "1990");
        assertFalse(orSearchCriteria.match(bookThree));
    }
}