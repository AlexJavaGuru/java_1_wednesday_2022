package student_aleksandrs_korsaks.ak_lesson_11.level_5.fraud_detector_v2;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}