package student_aleksandrs_korsaks.ak_lesson_11.level_5_6.fraud_detector_v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static student_aleksandrs_korsaks.ak_lesson_11.level_5_6.fraud_detector_v2.FraudRule2.TRX_AMOUNT_LIMIT;

class FraudRule4Test {

    FraudRule fraudRule4 = new FraudRule4("Not valid trader country \"Jamaica\"");

    @Test
    void isFraudNotValidTraderCountryTrueCase() {
        Trader trader = new Trader("John", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT);
        assertTrue(fraudRule4.isFraud(transaction));
    }

    @Test
    void isFraudValidTraderCountryFalseCase() {
        Trader trader = new Trader("John", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT);
        assertFalse(fraudRule4.isFraud(transaction));
    }
}