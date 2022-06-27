package student_aleksandrs_korsaks.ak_lesson_11.level_5.fraud_detector_v2;

public class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return (t.getTrader().getCountry().equals("Jamaica"));
    }
}
