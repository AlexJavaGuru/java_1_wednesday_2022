package student_arturs_melnikovs.lesson_15.level_02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import teacher.lesson_11_srp.lessoncode.newversion.Trader;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {
    FraudDetector fraudDetector;

    @BeforeEach
    void setUp() {
        fraudDetector = new FraudDetector();
    }

    @Test
    void testTraderNamePokemonIsFraud() {
        Trader trader = new Trader("Pokemon", "Test", "Test");
        assertTrue(fraudDetector.isFraud(trader));
    }

    @Test
    void testTraderCitySidneyIsFraud() {
        Trader trader = new Trader("Test", "Sidney", "Test");
        assertTrue(fraudDetector.isFraud(trader));
    }
}