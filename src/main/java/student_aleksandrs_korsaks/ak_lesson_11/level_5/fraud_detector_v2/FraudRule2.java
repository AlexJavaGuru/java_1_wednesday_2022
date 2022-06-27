package student_aleksandrs_korsaks.ak_lesson_11.level_5.fraud_detector_v2;

class FraudRule2 extends FraudRule {

    public static final int TRX_AMOUNT_LIMIT = 1000000;

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return (t.getAmount() > TRX_AMOUNT_LIMIT);
    }
}
