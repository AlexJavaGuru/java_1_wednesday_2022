package student_aleksandr_zuk.lesson_11;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }
    public String getRuleName() {
        return ruleName;
    }
    public abstract boolean isFraud(Transaction t);
}
