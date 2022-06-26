package student_aleksandrs_korsaks.ak_lesson_11.level_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static student_aleksandrs_korsaks.ak_lesson_11.level_4.FraudDetector.TRX_AMOUNT_LIMIT;

class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();

    @Test
    void isFraudNotValidTraderNameTrueCase() {
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudValidTraderNameFalseCase() {
        Trader trader = new Trader("John", "Riga");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudNotValidTrxAmountTrueCase() {
        Trader trader = new Trader("John", "Riga");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT + 1);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudValidTrxAmountFalseCase() {
        Trader trader = new Trader("John", "Riga");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT);
        assertFalse(fraudDetector.isFraud(transaction));
    }
}