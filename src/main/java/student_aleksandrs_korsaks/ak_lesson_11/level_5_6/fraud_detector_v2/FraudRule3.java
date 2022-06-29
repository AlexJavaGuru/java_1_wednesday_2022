package student_aleksandrs_korsaks.ak_lesson_11.level_5_6.fraud_detector_v2;

public class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return (t.getTrader().getCity().equals("Sidney"));
    }
}

