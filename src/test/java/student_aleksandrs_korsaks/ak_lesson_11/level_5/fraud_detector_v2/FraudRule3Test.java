package student_aleksandrs_korsaks.ak_lesson_11.level_5.fraud_detector_v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static student_aleksandrs_korsaks.ak_lesson_11.level_5.fraud_detector_v2.FraudRule2.TRX_AMOUNT_LIMIT;

class FraudRule3Test {

    FraudRule fraudRule3 = new FraudRule3("Not valid trader city \"Sidney\"");

    @Test
    void isFraudNotValidTraderCityTrueCase() {
        Trader trader = new Trader("John", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT);
        assertTrue(fraudRule3.isFraud(transaction));
    }

    @Test
    void isFraudValidTraderCityFalseCase() {
        Trader trader = new Trader("John", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT);
        assertFalse(fraudRule3.isFraud(transaction));
    }
}