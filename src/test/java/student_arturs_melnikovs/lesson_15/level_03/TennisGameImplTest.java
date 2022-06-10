package student_arturs_melnikovs.lesson_15.level_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TennisGameImplTest {
    TennisGameImpl game;

    @BeforeEach
    void setUp() {
        game = new TennisGameImpl("Mike", "John");
    }

    @Test
    void testScoreLessOrEqualsThreeV1() {
        String expected = "Love - Love";
        String actual = game.score();
        assertEquals(expected, actual);
    }
    @Test
    void testScoreLessOrEqualsThreeV2() {
        String expected = "Fifteen - Love";
        game.wonPoint("Mike");
        String actual = game.score();
        assertEquals(expected, actual);
    }
    @Test
    void testScoreLessOrEqualsThreeV3() {
        String expected = "Forty - Love";
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        String actual = game.score();
        assertEquals(expected, actual);
    }
    @Test
    void testScoreLessOrEqualsThreeV4() {
        String expected = "Forty - Thirty";
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("John");
        game.wonPoint("John");
        String actual = game.score();
        assertEquals(expected, actual);
    }

    @Test
    void testDeuceV1() {
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("John");
        game.wonPoint("John");
        game.wonPoint("John");
        assertEquals("Deuce", game.score());
    }
    @Test
    void testDeuceV2() {
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("John");
        game.wonPoint("John");
        game.wonPoint("John");
        game.wonPoint("John");
        assertEquals("Deuce", game.score());
    }

    @Test
    void testAdvantagePlayer1V1() {
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("John");
        game.wonPoint("John");
        game.wonPoint("John");
        assertEquals("Advantage Mike", game.score());
    }
    @Test
    void testAdvantagePlayer1V2() {
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("John");
        game.wonPoint("John");
        game.wonPoint("John");
        game.wonPoint("John");
        assertEquals("Advantage Mike", game.score());
    }
    @Test
    void testAdvantagePlayer2V1() {
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("John");
        game.wonPoint("John");
        game.wonPoint("John");
        game.wonPoint("John");
        assertEquals("Advantage John", game.score());
    }
    @Test
    void testAdvantagePlayer2V2() {
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("John");
        game.wonPoint("John");
        game.wonPoint("John");
        game.wonPoint("John");
        game.wonPoint("John");
        assertEquals("Advantage John", game.score());
    }

    @Test
    void testWinPlayer1V1() {
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        assertEquals("Win Mike", game.score());
    }
    @Test
    void testWinPlayer1V2() {
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("John");
        game.wonPoint("John");
        assertEquals("Win Mike", game.score());
    }

    @Test
    void testWinPlayer2V1() {
        game.wonPoint("John");
        game.wonPoint("John");
        game.wonPoint("John");
        game.wonPoint("John");
        assertEquals("Win John", game.score());
    }
    @Test
    void testWinPlayer2V2() {
        game.wonPoint("John");
        game.wonPoint("John");
        game.wonPoint("John");
        game.wonPoint("John");
        game.wonPoint("John");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        game.wonPoint("Mike");
        assertEquals("Win John", game.score());
    }
}