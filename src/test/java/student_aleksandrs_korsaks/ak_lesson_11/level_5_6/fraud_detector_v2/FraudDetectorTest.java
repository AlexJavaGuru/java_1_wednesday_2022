package student_aleksandrs_korsaks.ak_lesson_11.level_5_6.fraud_detector_v2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static student_aleksandrs_korsaks.ak_lesson_11.level_5_6.fraud_detector_v2.FraudRule2.TRX_AMOUNT_LIMIT;
import static student_aleksandrs_korsaks.ak_lesson_11.level_5_6.fraud_detector_v2.FraudRule5.TRX_AMOUNT_LIMIT_GERMANY;

class FraudDetectorTest {

    FraudDetector fraudDetector;
    FraudDetectionResult expectedFraudDetectionResult;

    @BeforeEach
    void setUp() {
        List<FraudRule> rules = new ArrayList<>();
        rules.add(new FraudRule1("Rule 1"));
        rules.add(new FraudRule2("Rule 2"));
        rules.add(new FraudRule3("Rule 3"));
        rules.add(new FraudRule4("Rule 4"));
        rules.add(new FraudRule5("Rule 5"));
        fraudDetector = new FraudDetector(rules);

    }

    @Test
    void isFraudNotValidTraderNameTrueCase() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100);
        expectedFraudDetectionResult = new FraudDetectionResult(true, "Rule 1");
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudValidTraderNameFalseCase() {
        Trader trader = new Trader("John", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100);
        expectedFraudDetectionResult = new FraudDetectionResult(false, null);
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudNotValidTrxAmountTrueCase() {
        Trader trader = new Trader("John", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT + 1);
        expectedFraudDetectionResult = new FraudDetectionResult(true, "Rule 2");
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudValidTrxAmountFalseCase() {
        Trader trader = new Trader("John", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT);
        expectedFraudDetectionResult = new FraudDetectionResult(false, null);
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudNotValidTraderCityTrueCase() {
        Trader trader = new Trader("John", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT);
        expectedFraudDetectionResult = new FraudDetectionResult(true, "Rule 3");
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudValidTraderCityFalseCase() {
        Trader trader = new Trader("John", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT);
        expectedFraudDetectionResult = new FraudDetectionResult(false, null);
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudNotValidTraderCountryTrueCase() {
        Trader trader = new Trader("John", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT);
        expectedFraudDetectionResult = new FraudDetectionResult(true, "Rule 4");
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudValidTraderCountryFalseCase() {
        Trader trader = new Trader("John", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT);
        expectedFraudDetectionResult = new FraudDetectionResult(false, null);
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudNotValidTraderCountryAndTrxAmountTrueCase() {
        Trader trader = new Trader("John", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT_GERMANY + 1);
        expectedFraudDetectionResult = new FraudDetectionResult(true, "Rule 5");
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudNotValidTraderCountryValidTrxAmountFalseCase() {
        Trader trader = new Trader("John", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, TRX_AMOUNT_LIMIT_GERMANY);
        expectedFraudDetectionResult = new FraudDetectionResult(false, null);
        assertEquals(expectedFraudDetectionResult, fraudDetector.isFraud(transaction));
    }
}