package student_aleksandrs_korsaks.ak_lesson_11.level_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();

    @Test
    void isFraudTrueCase() {
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudFalseCase() {
        Trader trader = new Trader("John", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudDetector.isFraud(transaction));
    }
}