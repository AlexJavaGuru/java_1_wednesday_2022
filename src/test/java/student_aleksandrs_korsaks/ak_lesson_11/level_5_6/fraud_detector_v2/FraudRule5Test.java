package student_aleksandrs_korsaks.ak_lesson_11.level_5_6.fraud_detector_v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static student_aleksandrs_korsaks.ak_lesson_11.level_5_6.fraud_detector_v2.FraudRule5.TRX_AMOUNT_LIMIT_GERMANY;

class FraudRule5Test {

    FraudRule fraudRule5 = new FraudRule5("Not valid trader country \"Germany\" and Not valid TRX amount (> 1000)");

    @Test
    void isFraudNotValidTraderCountryAndTrxAmountTrueCase() {
        Trader trader = new Trader("John", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT_GERMANY + 1);
        assertTrue(fraudRule5.isFraud(transaction));
    }

    @Test
    void isFraudNotValidTraderCountryValidTrxAmountFalseCase() {
        Trader trader = new Trader("John", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT_GERMANY);
        assertFalse(fraudRule5.isFraud(transaction));
    }
}