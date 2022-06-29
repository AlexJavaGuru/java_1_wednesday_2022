package student_aleksandrs_korsaks.ak_lesson_11.level_5_6.fraud_detector_v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static student_aleksandrs_korsaks.ak_lesson_11.level_5_6.fraud_detector_v2.FraudRule2.TRX_AMOUNT_LIMIT;

class FraudRule2Test {

    FraudRule fraudRule2 = new FraudRule2("Not valid TRX amount (> 1000000)");

    @Test
    void isFraudNotValidTrxAmountTrueCase() {
        Trader trader = new Trader("John", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT + 1);
        assertTrue(fraudRule2.isFraud(transaction));
    }

    @Test
    void isFraudValidTrxAmountFalseCase() {
        Trader trader = new Trader("John", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT);
        assertFalse(fraudRule2.isFraud(transaction));
    }
}
