package student_aleksandrs_korsaks.ak_lesson_11.level_5.fraud_detector_v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule1Test {

    FraudRule fraudRule1 = new FraudRule1("Not valid trades name \"Pokemon\"");

    @Test
    void isFraudNotValidTraderNameTrueCase() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudRule1.isFraud(transaction));
    }

    @Test
    void isFraudValidTraderNameFalseCase() {
        Trader trader = new Trader("John", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudRule1.isFraud(transaction));
    }
}