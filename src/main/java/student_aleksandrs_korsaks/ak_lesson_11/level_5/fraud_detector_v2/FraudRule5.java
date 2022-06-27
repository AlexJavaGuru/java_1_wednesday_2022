package student_aleksandrs_korsaks.ak_lesson_11.level_5.fraud_detector_v2;

public class FraudRule5 extends FraudRule {

    public static final int TRX_AMOUNT_LIMIT_GERMANY = 1000;

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return ((t.getTrader().getCountry().equals("Germany")) && (t.getAmount() > TRX_AMOUNT_LIMIT_GERMANY));
    }
}

